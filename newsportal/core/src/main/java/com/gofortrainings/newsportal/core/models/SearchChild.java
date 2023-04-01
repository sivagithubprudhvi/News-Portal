package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class)
public class SearchChild {

	@ValueMapValue
	private String stuId;
	@ValueMapValue
	private String stuName;
	@ValueMapValue
	private String stuBranch;
	
	
	public String getStuId() {
		return stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public String getStuBranch() {
		return stuBranch;
	}
	
	
}
