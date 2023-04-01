package com.gofortrainings.newsportal.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.gofortrainings.newsportal.core.service.TigerService;

import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;


@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)

public class Last {
 @ValueMapValue
	private String text;
 
 @ValueMapValue
 private String checkBox1;
 
 @ValueMapValue
 private String select;
 
 
 
 
 @ChildResource
 List<Child> child;
 @OSGiService
 TigerService tigerService;
 
 private String message;
 private String message1;
 
 
 
 
public String getText() {
	return text;
}

public List<Child> getChild() {
	return child;
}

public String getMessage() {
	return message;
}
public String getMessage1() {
	return message1;
}
@PostConstruct
public void testing() {
	message=tigerService.siva();
	message1=tigerService.id();
}

public String getCheckBox1() {
	return checkBox1;
}

public String getSelect() {
	return select;
}




}