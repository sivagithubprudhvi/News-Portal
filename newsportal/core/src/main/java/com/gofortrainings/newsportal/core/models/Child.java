package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class Child {
	
	@ValueMapValue
	private String stFname;
	
	@ValueMapValue
	private String stLname;
	
	@ValueMapValue
	private String stPath;
	
	@ValueMapValue
	private String dropDown;
	@ValueMapValue
	private String checkBox;

	@ValueMapValue
	private String checkImg;

	public String getStFname() {
		return stFname;
	}

	public String getStLname() {
		return stLname;
	}

	public String getStPath() {
		return stPath;
	}

	public String getDropDown() {
		return dropDown;
	}

	public String getCheckBox() {
		return checkBox;
	}

	public String getCheckImg() {
		return checkImg;
	}

	
}
