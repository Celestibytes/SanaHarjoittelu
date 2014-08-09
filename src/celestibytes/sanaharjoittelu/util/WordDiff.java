package celestibytes.sanaharjoittelu.util;

import celestibytes.sanaharjoittelu.data.Word;

public class WordDiff {
	
	public static final byte CHAR_CORRECT = 0x00;
	public static final byte CHAR_INCORRECT = 0x01;
	public static final byte CHAR_MISSING = 0x02;
	public static final byte CHAR_EXTRA = 0x03;
	
	
	public final Word original;
	public final byte[][] diff;
	
	
	protected WordDiff(Word original, byte[][] diff) {
		this.original = original;
		this.diff = diff;
	}
	
	public static WordDiff createWDiff(Word a, Word b, boolean checkA) {
		//TODO
		return null;
	}
}
