package celestibytes.sanaharjoittelu.util;

import celestibytes.sanaharjoittelu.data.Word;

public class WordUtil {
	
	public static final int WORD_COMPARE_EQUAL = 0;
	public static final int WORD_COMPARE_DIFF = 1;
	
	/**How b differs from a (a = original, b = user's input). 0 = correct*/
	public static byte[][] WordDiff(Word a, Word b, boolean checkA) {
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
		
		byte[][] ret = new byte[wordParts][longestWord];
		
		char[] toCheck;
		char[] correct;
		int iters2;
		
		for(i=0;i<iters;i++) { // Word loop
			toCheck = b.getFromA(i).toCharArray();
			if(checkA) {
				correct = a.getFromA(i).toCharArray();
			} else {
				correct = a.getFromB(i).toCharArray();
			}
			iters2 = Math.max(toCheck.length, correct.length);
			int toCheckOffset = 0;
			
			for(int i2=0;i2<iters2;i2++) { // Character loop
				System.out.println("I2 - begin: " + i2);
				if(i2+toCheckOffset >= toCheck.length || i2 >= correct.length) {
					ret[i][i2] = WordDiff.CHAR_INCORRECT;
				} else {
					if(toCheck[i2+toCheckOffset] != correct[i2]) {
						// Check for missing character
						int arrEqUntil;
						if(toCheck[i2+toCheckOffset] == correct[i2+1 < correct.length ? i2+1 : i2]) {
							arrEqUntil = Util.arrayEqualUntil(toCheck, correct, i2+toCheckOffset, i2+1, correct.length-(i2+1));
							if(arrEqUntil >= 1 || i2+arrEqUntil >= iters2-1) {
								ret[i][i2+toCheckOffset < longestWord && i2+toCheckOffset >= 0 ? i2+toCheckOffset : i2] = WordDiff.CHAR_MISSING;
								toCheckOffset--; //!
								
								// Useless for loop?
								for(int i3=i2+1;i3<i2+arrEqUntil;i3++) {
									ret[i][i3] = WordDiff.CHAR_CORRECT;
								}
								i2 = i2 + arrEqUntil+1;
								continue;
							}
						}
						// Check for extra character
						if(toCheck[i2+toCheckOffset+1 < toCheck.length ? i2+toCheckOffset+1 : i2+toCheckOffset] == correct[i2]) {
							arrEqUntil = Util.arrayEqualUntil(toCheck, correct, i2+toCheckOffset+1, i2, correct.length-(i2));
							if(arrEqUntil >= 1 || i2+arrEqUntil >= iters2-1) {
								ret[i][i2+toCheckOffset < longestWord && i2+toCheckOffset >= 0 ? i2+toCheckOffset : i2] = WordDiff.CHAR_EXTRA; // TODO: use offset
								toCheckOffset++;
								i2 = i2 + arrEqUntil+1;
								System.out.println("nextCyc: " + i2);
								continue;
							}
						}
						ret[i][i2+toCheckOffset < longestWord && i2+toCheckOffset >= 0 ? i2+toCheckOffset : i2] = WordDiff.CHAR_INCORRECT;
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
