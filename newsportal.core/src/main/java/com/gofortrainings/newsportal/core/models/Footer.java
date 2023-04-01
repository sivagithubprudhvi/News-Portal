package com.gofortrainings.newsportal.core.models;


import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables=Resource.class)
public class Footer {

	@ValueMapValue
	private String heading1;
	@ValueMapValue
	private String heading2;
	@ValueMapValue
	private String heading3;
	
	@ChildResource
	 List<FooterChild1> fc1;
	 List<FooterChild2> fc2;
	 List<FooterChild3> fc3;
	
	public String getHeading1() {
		return heading1;
	}
	public String getHeading2() {
		return heading2;
	}
	public String getHeading3() {
		return heading3;
	}
	public List<FooterChild1> getFc1() {
		return fc1;
	}
	public List<FooterChild2> getFc2() {
		return fc2;
	}
	public List<FooterChild3> getFc3() {
		return fc3;
	}
	
	
	
	
}
