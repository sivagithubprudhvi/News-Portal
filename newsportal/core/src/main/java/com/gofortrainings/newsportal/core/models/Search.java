package com.gofortrainings.newsportal.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.cq.wcm.core.components.commons.link.Link;

@Model(adaptables=Resource.class)
public class Search {
	@ValueMapValue
	private String text;
	@ValueMapValue
	private String select;
	@ValueMapValue
	private String Cse;
	
	
	/*@ValueMapValue
	private String Mec;
	@ValueMapValue
	private String Civ;
	@ValueMapValue
	private String Ece;*/
	@ValueMapValue
	private String image;
	
	
	@ChildResource
	 List<SearchChild> sc;
	
	
	public String getText() {
		return text;
	}
	public String getSelect() {
		return select;
	}
	public String getCse() {
		return Cse;
	}
	/*public String getMec() {
		return Mec;
	}
	public String getCiv() {
		return Civ;
	}
	public String getEce() {
		return Ece;
	}*/
	public List<SearchChild> getSc() {
		return sc;
	}
	public String getImage() {
		return image;
	}
	
	
}
