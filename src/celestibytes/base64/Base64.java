package celestibytes.base64;

public class Base64 {
	public static final char[] BASE64_CHARACTERS = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
	public static final char BASE64_PADDING = '=';
	
	public static String encode(String s) {
		int buffer = 0x0;
		int bufferIndex = 0;
		System.out.print("B64 Value: ");
		for(int i=0;i<s.length();i++) {
			buffer |= (int)(s.charAt(i)) << 8*bufferIndex;
			if(i == s.length()-1) {
				// Add padding
			}
			if(bufferIndex == 2) {
				
				for(int encInd = 3; encInd > -1; encInd--) {
					System.out.print(BASE64_CHARACTERS[((buffer >> encInd*6) & 63)]);
				}
				
				buffer = 0;
				bufferIndex=0;
			}
			
			bufferIndex++;
		}
		System.out.println();
		System.out.println("BufferHex: " + Integer.toHexString(buffer));
		System.out.println("BufferBin: " + Integer.toBinaryString(buffer));
		return null;
	}
	
	public static String decode(String s) {
		return null;
	}
}
