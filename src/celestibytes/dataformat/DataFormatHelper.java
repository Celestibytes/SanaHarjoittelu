package celestibytes.dataformat;

import java.util.ArrayList;
import java.util.List;

public class DataFormatHelper {
	// because json is overrated :P
	
	public static String[] splitObjectString(String str) {
		List<String> ret2 = new ArrayList<String>();
		int i;
		char chr;
		int ignoreValue = 0;
		StringBuilder strBuf = new StringBuilder();
		boolean ignStr = false;
		for(i=0;i<str.length();i++) {
			chr = str.charAt(i);

			if(chr == '"') {
				ignStr = !ignStr;
			}
	
			if(chr == '[' || chr == '{') {
				ignoreValue++;
			}
			if(chr == ']' || chr == '}') {
				ignoreValue--;
			}
			if(ignoreValue == 0 && !ignStr && (chr == ':' || chr == ',')) {
				ret2.add(strBuf.toString());
				strBuf = new StringBuilder();
			} else {
				if((int)chr != 0x20) { // ignore whitespaces TODO: ignore tabs & newlines 
					strBuf = strBuf.append(chr);
				}
			}
		}
		ret2.add(strBuf.toString());
		return ret2.toArray(new String[0]);
	}
	
	public static String buildFullDataFormatString(DataFormatPart[] ps) {
		return null;
	}
	
	public static String wrapDataFormatObject() {
		return null;
	}
	
	public static String wrapDataFormatString() {
		return null;
	}
	
	public static String wrapDataFormatArray() {
		return null;
	}
	
	/**booleans and numbers*/
	public static String wrapDataFormatValue() {
		return null;
	}
}
