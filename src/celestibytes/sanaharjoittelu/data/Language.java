package celestibytes.sanaharjoittelu.data;

import celestibytes.sanaharjoittelu.ref.Reference;

public enum Language {
	ENGLISH,
	FINNISH,
	SWEDISH;
	// TODO: add more languages
	
	public final int code;
	
	private Language() {
		this.code = Reference.langCounter++;
	}
}
