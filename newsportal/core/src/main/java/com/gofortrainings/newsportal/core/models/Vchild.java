package com.gofortrainings.newsportal.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy =DefaultInjectionStrategy.OPTIONAL )

public class Vchild {
@ValueMapValue
private String description;

@ValueMapValue
private String stId;

public String getDescription() {
	return description;
}

public String getStId() {
	return stId;
}
	
}
