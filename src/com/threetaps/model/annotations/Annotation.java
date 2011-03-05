package com.threetaps.model.annotations;

import java.util.List;

public class Annotation {

	private String name;
	private AnnotationType annotationType;
	private List<AnnotationOption> options;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public AnnotationType getAnnotationType() {
		return annotationType;
	}
	
	public void setAnnotationType(AnnotationType annotationType) {
		this.annotationType = annotationType;
	}
	
	public List<AnnotationOption> getOptions() {
		return options;
	}
	
	public void setOptions(List<AnnotationOption> options) {
		this.options = options;
	}

}
