package celestibytes.sanaharjoittelu;

import celestibytes.sanaharjoittelu.data.Word;
import celestibytes.sanaharjoittelu.util.WordUtil;

public class SanaHarjoittelu {
	public static boolean DEBUG = false;
	
	public static void main(String[] args) {
		if(args.length >= 1 && args[0] == "DEBUG") {
			DEBUG = true;
		}
		Word a = new Word(new String[]{"tst1","tst2","tst33"},new String[]{"ans1","ans2"}); // "Original"
		Word b = new Word(new String[]{"ttt1","sst2","tst3"}); // "input"
		boolean[][] diff = WordUtil.WordDiff(a, b, true);
		for(int i=0;i<diff.length;i++) {
			System.out.println("["+i+"]:");
			for(int i2=0;i2<diff[i].length;i2++) {
				System.out.println("--> " + diff[i][i2]);
			}
		}
		
		
	}
	
	
}
