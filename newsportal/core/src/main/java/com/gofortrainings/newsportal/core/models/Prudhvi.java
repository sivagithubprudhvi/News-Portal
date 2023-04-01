package com.gofortrainings.newsportal.core.models;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;

@Model(adaptables = Resource.class)

public class Prudhvi {
	
@ValueMapValue
private String text;

@ValueMapValue
private String description;

@ValueMapValue(name="jcr:created")
private String jcrcreated;

@ValueMapValue(name="jcr:createdBy")
private String jcrcreatedBy;

@ChildResource
 private List<Student> student;

public String getText() 
{
	return text;
}

public String getDescription() {
	return description;
}

public String getJcrcreated() {
	return jcrcreated;
}

public String getJcrcreatedBy() {
	return jcrcreatedBy;
}
public List<Student> getStudent() {
	return student;
}
 

@PostConstruct
public void init() {
	String jcrRef = "This is created: " + jcrcreated;
}
public void String() {
	String jcrRefby = "jcr:createdBy: " + jcrcreatedBy;
}





}


