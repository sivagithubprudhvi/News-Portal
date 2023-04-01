package com.gofortrainings.newsportal.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy =DefaultInjectionStrategy.OPTIONAL )
public class Vijaya {
	
	@ValueMapValue
	private String text;
	
	@ChildResource
	List<Vchild> vchild;

	public String getText() {
		return text;
	}

	public List<Vchild> getVchild() {
		return vchild;
	}

}
