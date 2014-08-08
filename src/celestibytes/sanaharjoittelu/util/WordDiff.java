package celestibytes.sanaharjoittelu.util;

import celestibytes.sanaharjoittelu.data.Word;

public class WordDiff {
	
	public final Word original;
	public final char[][] diff;
	
	
	protected WordDiff(Word original, char[][] diff) {
		this.original = original;
		this.diff = diff;
	}
}
