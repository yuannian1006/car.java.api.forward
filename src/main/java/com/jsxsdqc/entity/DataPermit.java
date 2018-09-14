package com.jsxsdqc.entity;

//数据权限设置
public class DataPermit {
	
	private boolean dataPermit;
	
	public DataPermit(boolean dataPermit) {
		this.dataPermit = dataPermit;
	}
	
	public DataPermit() {
		this.dataPermit = true;
	}

	public boolean isDataPermit() {
		return dataPermit;
	}

	public void setDataPermit(boolean dataPermit) {
		this.dataPermit = dataPermit;
	}
}
