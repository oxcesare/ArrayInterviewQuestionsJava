package com.mx.examen.demo.albo.response;

public class DemoCharacterResponse {

	private String code;
	private String status;
	private String copyright;
	private String attributionText;
	private String attributionHTML;	
	private DataCharacter data;
	private String etag;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public String getAttributionText() {
		return attributionText;
	}
	public void setAttributionText(String attributionText) {
		this.attributionText = attributionText;
	}
	public String getAttributionHTML() {
		return attributionHTML;
	}
	public void setAttributionHTML(String attributionHTML) {
		this.attributionHTML = attributionHTML;
	}
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
	}
	public DataCharacter getData() {
		return data;
	}
	public void setData(DataCharacter data) {
		this.data = data;
	}
	
	
	
	
	
	

}
