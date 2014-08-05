package celestibytes.sanaharjoittelu;

import celestibytes.sanaharjoittelu.data.Category;

public class SanaHarjoittelu {
	public static boolean DEBUG = false;
	
	public static void main(String[] args) {
		if(args.length >= 1 && args[0] == "DEBUG") {
			DEBUG = true;
		}
	}
	
	
}
