package com.gofortrainings.newsportal.core.models;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class)
public class Services {

	@ValueMapValue
	private String image1;
	@ValueMapValue
	private String text1;
	
	@ValueMapValue
	private String image2;
	@ValueMapValue
	private String text2;
	
	@ValueMapValue
	private String image3;
	@ValueMapValue
	private String text3;
	
	@ValueMapValue
	private String image4;
	@ValueMapValue
	private String text4;
}
