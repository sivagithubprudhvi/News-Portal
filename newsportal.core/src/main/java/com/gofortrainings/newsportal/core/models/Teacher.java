package com.gofortrainings.newsportal.core.models;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;

@Model( adaptables=Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Teacher {
	@ValueMapValue
	private String studentName;
	
	@ValueMapValue
	private String studentPath;
	
	@ValueMapValue
	private String studentAdh;
	
	@ValueMapValue
	private String studentDes;

	public String getStudentName() {
		return studentName;
	}

	public String getStudentPath() {
		return studentPath;
	}

	public String getStudentAdh() {
		return studentAdh;
	}

	public String getStudentDes() {
		return studentDes;
	}
	
	

}
