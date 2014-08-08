package celestibytes.ioutil;

import java.io.File;
import java.io.InputStream;

public class FileLoader {
	
	
	public static void writeToFile(File dest, InputStream input) {
		if(dest != null && dest.exists() && dest.isFile() && input != null) {
			
		} else {
			throw new IllegalArgumentException();
		}
	}
}
