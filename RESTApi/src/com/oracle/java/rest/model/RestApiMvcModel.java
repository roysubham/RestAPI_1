package com.oracle.java.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RestApiMvcModel {
private String value;

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}

}
