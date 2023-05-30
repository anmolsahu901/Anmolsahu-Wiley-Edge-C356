package com.wiley.SpringCore.A1;

import java.util.Properties;

public class Studentinfo {
	private Properties props;

	public Studentinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Studentinfo [props=" + props + "]";
	}

	public Studentinfo(Properties props) {
		super();
		this.props = props;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}
	
	
}
