package SAL.ROCC.ProtocolService;

public class ProtocolMetaData {
	
	String protocolId;
	String protocolName;
	String modality;
	String consoleVersion;
	String consoleVendor;
	String consoleModel;
	
	public ProtocolMetaData() {
	}

	public ProtocolMetaData(String protocolName, String modality, String consoleVersion, String consoleVendor,
			String consoleModel) {
		this.protocolName = protocolName;
		this.modality = modality;
		this.consoleVersion = consoleVersion;
		this.consoleVendor = consoleVendor;
		this.consoleModel = consoleModel;
	}

	public String getProtocolId() {
		return protocolId;
	}

	public void setProtocolId(String protocolId) {
		this.protocolId = protocolId;
	}

	public String getProtocolName() {
		return protocolName;
	}

	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}

	public String getModality() {
		return modality;
	}

	public void setModality(String modality) {
		this.modality = modality;
	}

	public String getConsoleVersion() {
		return consoleVersion;
	}

	public void setConsoleVersion(String consoleVersion) {
		this.consoleVersion = consoleVersion;
	}

	public String getConsoleVendor() {
		return consoleVendor;
	}

	public void setConsoleVendor(String consoleVendor) {
		this.consoleVendor = consoleVendor;
	}

	public String getConsoleModel() {
		return consoleModel;
	}

	public void setConsoleModel(String consoleModel) {
		this.consoleModel = consoleModel;
	}

	@Override
	public String toString() {
		return "ProtocolMetaData [protocolId=" + protocolId + ", protocolName=" + protocolName + ", modality="
				+ modality + ", consoleVersion=" + consoleVersion + ", consoleVendor=" + consoleVendor
				+ ", consoleModel=" + consoleModel + "]";
	}
	
}
