package com.gofortrainings.newsportal.core.models;



	import javax.annotation.PostConstruct;

	import org.apache.sling.api.resource.Resource;
	import org.apache.sling.models.annotations.Model;
	import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

	@Model(adaptables = Resource.class)
	public class Pheader {

		@ValueMapValue
		private String text;
		
		@ValueMapValue(name="sling:resourceType")
		private String slingresourceType;

		public String getText() {
			return text;
		}

		public String getSlingresourceType() {
			return slingresourceType;
		}
		@PostConstruct
		public void init() {
		}
	}
