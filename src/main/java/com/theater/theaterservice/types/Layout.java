package com.theater.theaterservice.types;

import java.util.List;

public class Layout {

	private Integer row;
	private List<Section> sections = null;

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

}