package com.gofortrainings.newsportal.core.models;

import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.Model;
import java.util.List;

import org.apache.sling.api.resource.Resource;

@Model(adaptables=Resource.class)
public class Siva {

		@ChildResource
	 List<Teacher>teacher;
	
		public List<Teacher> getTeacher() {
		return teacher;
	}
	
	
}
