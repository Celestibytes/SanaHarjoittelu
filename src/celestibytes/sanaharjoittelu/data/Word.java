package celestibytes.sanaharjoittelu.data;

public class Word {
	
	/**words in lang A*/
	private String[] a;
	
	/**words in lang B*/
	private String[] b;
	
	public Word(String[] a, String[] b) {
		this.a = a;
		this.b = b;
	}
	
	public Word(String[] a) {
		this.a = a;
	}
	
	public boolean singleWord() {
		return (this.a==null || this.b == null) && !(this.a == null && this.b == null);
	}
	
	public String getFromA(int i) {
		return this.a[i];
	}
	
	public String getFromB(int i) {
		return this.b[i];
	}
	
	public String[] getA() {
		return this.a;
	}
	
	public String[] getB() {
		return this.b;
	}
	
	public int getALength() {
		return this.a.length;
	}
	
	public int getBLength() {
		return this.b.length;
	}
}
