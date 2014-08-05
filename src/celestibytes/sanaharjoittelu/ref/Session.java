package celestibytes.sanaharjoittelu.ref;

import java.io.OutputStream;

import celestibytes.dataformat.interfaces.IDataFormatted;

public class Session implements IDataFormatted {
	
	private boolean needSave = false;
	
	
	private boolean isSaveNeeded() {
		return needSave;
	}
	
	private void save(OutputStream out) {
		
		
	}
	
	public void saveIfNeeded() {
		
	}

	@Override
	public String getObjectString() {
		return null;
	}
}
