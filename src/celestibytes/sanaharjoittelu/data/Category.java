package celestibytes.sanaharjoittelu.data;

public class Category {
	
	private Category subCategory = null;
	private String categoryName = "namelessCategory";
	
	public Category(String categ) {
		final int fDotIndex = categ.indexOf(".");
		if(fDotIndex != -1) {
			this.categoryName = categ.substring(0, fDotIndex);
			this.subCategory = new Category(categ.substring(fDotIndex+1, categ.length()));
		} else {
			this.categoryName = categ;
		}
	}
	
	public Category getSubCategory() {
		return this.subCategory;
	}
	
	public String getCategoryName() {
		return this.categoryName;
	}
	
}
