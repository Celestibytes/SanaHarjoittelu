package celestibytes.dataformat.dataformattypes;

import celestibytes.dataformat.DataFormatPart;

public class DataFormatNumber extends DataFormatPart {
	
	private final DataFormatNumberType nType;
	private Object value;
	
	private DataFormatNumber(DataFormatNumberType nType, Object value) {
		this.nType = nType;
		this.value = value;
	}
	
	public DataFormatNumber(byte value) {
		this(DataFormatNumberType.BYTE, value);
	}
	
	public DataFormatNumber(short value) {
		this(DataFormatNumberType.SHORT, value);
	}
	
	public DataFormatNumber(int value) {
		this(DataFormatNumberType.INT, value);
	}
	
	public DataFormatNumber(long value) {
		this(DataFormatNumberType.LONG, value);
	}
	
	public DataFormatNumber(float value) {
		this(DataFormatNumberType.FLOAT, value);
	}
	
	public DataFormatNumber(double value) {
		this(DataFormatNumberType.DOUBLE, value);
	}
	
	@Override
	public boolean isContainer() {
		return false;
	}

	@Override
	public DataFormatType getFormatType() {
		return DataFormatType.NUMERIC;
	}

	@Override
	public String getObjectString() {
		return "{t:\"" + this.nType.name + "\"}";
	}
	
	private static enum DataFormatNumberType {
		BYTE("byte"),
		SHORT("short"),
		INT("int"),
		LONG("long"),
		FLOAT("float"),
		DOUBLE("double");
		
		public final String name;
		
		private DataFormatNumberType(String name) {
			this.name = name;
		}
	}

}
