package celestibytes.sanaharjoittelu.util;

import celestibytes.sanaharjoittelu.data.Word;

public class WordUtil {
	
	public static final int WORD_COMPARE_EQUAL = 0;
	public static final int WORD_COMPARE_DIFF = 1;
	
	/**How b differs from a (a = original, b = user's input). true = incorrect*/
	public static boolean[][] WordDiff(Word a, Word b, boolean checkA) {
		int wordParts = checkA ? a.getALength() : a.getBLength();
		if(!b.singleWord()) {
			return null;
		}
		if(checkA) {
			if(a.getALength() != b.getALength()) {
				return null;
			}
		} else {
			if(a.getBLength() != b.getBLength()) {
				return null;
			}
		}
		
		/*Useless checks, needs cleanup*/
		int longestWord = 0;
		int iters = checkA ? a.getALength() : a.getBLength();
		int i;
		int cWrdLength = -1;
		for(i=0;i<iters;i++) {
			if(checkA) {
				cWrdLength = a.getFromA(i).length();
			} else {
				cWrdLength = a.getFromB(i).length();
			}
			if(cWrdLength > longestWord) {
				longestWord = cWrdLength;
			}
		}
		
		/*Useless checks, needs cleanup*/
		iters = checkA ? b.getALength() : b.getBLength();
		for(i=0;i<iters;i++) {
			if(checkA) {
				cWrdLength = b.getFromA(i).length();
			} else {
				cWrdLength = b.getFromB(i).length();
			}
			if(cWrdLength > longestWord) {
				longestWord = cWrdLength;
			}
		}
		
		boolean[][] ret = new boolean[wordParts][longestWord];
		
		char[] toCheck;
		char[] correct;
		int iters2;
		for(i=0;i<iters;i++) {
			toCheck = b.getFromA(i).toCharArray();
			if(checkA) {
				correct = a.getFromA(i).toCharArray();
			} else {
				correct = a.getFromB(i).toCharArray();
			}
			iters2 = Math.max(toCheck.length, correct.length);
			
			for(int i2=0;i2<iters2;i2++) {
				if(i2 >= toCheck.length || i2 >= correct.length) {
//					ret[i] = Util.spamBool(true, correct.length);
					ret[i][i2] = true;
				} else {
					if(toCheck[i2] != correct[i2]) {
						ret[i][i2] = true;
					}
				}
			}
		}
		
		System.out.println("Longest word: " + longestWord);
		
		return ret;
	}
	
	/**Does a differ from b*/
	public static boolean WordCmp(Word a, Word b) {
		return false;
	}
}
