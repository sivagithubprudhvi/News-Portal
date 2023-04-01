package com.gofortrainings.newsportal.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;


@ObjectClassDefinition(name="Prudhvi Config", description="This is Description...")
public @interface PrudhviConfig{

	@AttributeDefinition(name = "siva", description = "This Is My Name", required = true)

	public String siva() default "Siva";
	
	@AttributeDefinition(
			name = "country", 
			description = "This Is My Name",
			required = true
			)
	public String[] getCountries() default {"USA","INDIA"};

}
