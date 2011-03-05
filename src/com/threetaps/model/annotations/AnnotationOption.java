package com.threetaps.model.annotations;

public class AnnotationOption {
	
	private String value;
	private Annotation subAnnotation;
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public Annotation getSubAnnotation() {
		return subAnnotation;
	}
	
	public void setSubAnnotation(Annotation subAnnotation) {
		this.subAnnotation = subAnnotation;
	}

}
