package com.gofortrainings.newsportal.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class)
public class Header {
	@ValueMapValue
	private String text;
	
	
	@ChildResource
	 List<HeaderChild> hd;
	
	public String getText() {
		return text;
	}
	
	public List<HeaderChild> getHd() {
		return hd;
	}

}
