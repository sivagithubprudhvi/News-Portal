package com.gofortrainings.newsportal.core.service;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Tiger configurations", description = "This config is help for providing runtime valuesn to tiger service.")
public @interface TigerConfig {

	@AttributeDefinition(name = "siva", description = "This Is My Name", required = true)
	public String siva() default "Siva Prudhvi";
	
	@AttributeDefinition(name = "id", description = "This Is My Id Number", required = true)
	public int id() default 1001;
	
	@AttributeDefinition(name = "salary", description = "This Is My salary", required = true)
	public double salary() default 25000.34;
	
	@AttributeDefinition(
			name = "Countries", 
			description = "Add your Country here :" 
			)
	public String[] getCountries() default {"USA","America"};

}