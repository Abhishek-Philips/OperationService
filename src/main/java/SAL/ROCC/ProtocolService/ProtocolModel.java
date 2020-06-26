package SAL.ROCC.ProtocolService;

import java.io.InputStream;

public class ProtocolModel {
	
	ProtocolMetaData metaData;
	InputStream protocolContent;
	
	public ProtocolModel() {
	}
	
	public ProtocolModel(ProtocolMetaData metaData, InputStream protocol) {
		super();
		this.metaData = metaData;
		this.protocolContent = protocol;
	}

	public ProtocolMetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(ProtocolMetaData metaData) {
		this.metaData = metaData;
	}

	public InputStream getProtocol() {
		return protocolContent;
	}

	public void setProtocol(InputStream protocolContent) {
		this.protocolContent = protocolContent;
	}

	@Override
	public String toString() {
		return "ProtocolModel [metaData=" + metaData + ", protocolContent=" + protocolContent + "]";
	}
	
}