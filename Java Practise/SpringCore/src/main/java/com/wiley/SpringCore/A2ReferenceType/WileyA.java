package com.wiley.SpringCore.A2ReferenceType;

public class WileyA {

	private int counta;
	private WileyB obj;
	public int getCounta() {
		return counta;
	}
	public void setCounta(int counta) {
		this.counta = counta;
	}
	public WileyB getObj() {
		return obj;
	}
	public void setObj(WileyB obj) {
		this.obj = obj;
	}
	public WileyA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WileyA(int counta, WileyB obj) {
		super();
		this.counta = counta;
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "WileyA [counta=" + counta + ", obj=" + obj + "]";
	}
	
	

}
