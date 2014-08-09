package celestibytes.sanaharjoittelu.util;

public class Util {
	
	public static char[] spamChar(char chr, int amount) {
		char[] ret = new char[amount];
		for(int i=0;i<ret.length;i++) {
			ret[i] = chr;
		}
		return ret;
	}
	
	public static int[] spamNum(int num, int amount) {
		int[] ret = new int[amount];
		for(int i=0;i<ret.length;i++) {
			ret[i] = num;
		}
		return ret;
	}
	
	public static boolean[] spamBool(boolean bol, int amount) {
		boolean[] ret = new boolean[amount];
		for(int i=0;i<ret.length;i++) {
			ret[i] = bol;
		}
		return ret;
	}
	
	public static byte max_array(byte[] arr) {
		if(arr != null && arr.length > 0) {
			byte max = arr[0];
			for(int i = 0;i < arr.length;i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}
		return Byte.MIN_VALUE;
	}
	
	public static short max_array(short[] arr) {
		if(arr != null && arr.length > 0) {
			short max = arr[0];
			for(int i = 0;i < arr.length;i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}
		return Short.MIN_VALUE;
	}
	
	public static int max_array(int[] arr) {
		if(arr != null && arr.length > 0) {
			int max = arr[0];
			for(int i = 0;i < arr.length;i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}
		return Integer.MIN_VALUE;
	}
	
	public static long max_array(long[] arr) {
		if(arr != null && arr.length > 0) {
			long max = arr[0];
			for(int i = 0;i < arr.length;i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}
		return Long.MIN_VALUE;
	}
	
	public static boolean arrayEqual(char[] a, char[] b, int aStart, int bStart, int length) {
		for(int i=0;i<length;i++) {
			if(a[aStart+i] != b[bStart+i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int arrayEqualUntil(char[] a, char[] b, int aStart, int bStart, int length) {
		for(int i=0;i<length;i++) {
			if(a[aStart+i] != b[bStart+i]) {
				return i-1;
			}
		}
		return length-1;
	}
	
}
