package com.mx.examen.demo.albo.response;

import java.util.List;

public class ColaboradoresResponse {

	private String last_sync;
	private List<String> editors;
	private List<String> writers;
	private List<String> colorists;

	public String getLast_sync() {
		return last_sync;
	}

	public void setLast_sync(String last_sync) {
		this.last_sync = last_sync;
	}

	public List<String> getEditors() {
		return editors;
	}

	public void setEditors(List<String> editors) {
		this.editors = editors;
	}

	public List<String> getWriters() {
		return writers;
	}

	public void setWriters(List<String> writers) {
		this.writers = writers;
	}

	public List<String> getColorists() {
		return colorists;
	}

	public void setColorists(List<String> colorists) {
		this.colorists = colorists;
	}

}
