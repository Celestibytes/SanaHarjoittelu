package celestibytes.dataformat;

import celestibytes.dataformat.interfaces.IDataFormatted;

public abstract class DataFormatPart implements IDataFormatted {
	
	public abstract boolean isContainer();
	
	public abstract DataFormatType getFormatType();
	
	public static enum DataFormatType {
		TEXT,
		NUMERIC,
		BINARY,
		OTHER;
	}
}
