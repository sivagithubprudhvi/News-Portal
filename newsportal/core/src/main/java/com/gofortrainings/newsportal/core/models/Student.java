package com.gofortrainings.newsportal.core.models;


import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;

@Model(adaptables = Resource.class)
public class Student {
@ValueMapValue
private int StudentIds;
@ValueMapValue	
	private String StudentName;
@ValueMapValue
	private int StudentAge;
public int getStudentIds() {
	return StudentIds;
}
public String getStudentName() {
	return StudentName;
}
public int getStudentAge() {
	return StudentAge;
}
}
