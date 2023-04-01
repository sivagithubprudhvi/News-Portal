package com.gofortrainings.newsportal.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service = TigerService.class)
@Designate(ocd = TigerConfig.class)
public class TigerService {
	
	private static final Logger logger = LoggerFactory.getLogger(TigerService.class);
	
	@Reference
	private AnimalService animalservice;
	
	TigerConfig tigerconfig;
	private String name;
	private String  name1;

	@Activate
	public void active(	TigerConfig tigerConfig) {
		//logger.info("Newsportal Bundles is activated from Tiger....");
		//logger.info("This for Checking  : " + animalservice.eat("meat"));
		logger.info("This is my Name : " + tigerConfig.siva());
		logger.info("This is My id : " + tigerConfig.id());
		logger.info("This is my salary : " + tigerConfig.salary());
		logger.info("Select Your Country : " + tigerConfig.getCountries());
		this.tigerconfig=tigerConfig;
		name=tigerConfig.siva();
		name1=tigerConfig.siva();
		
	}
	public String siva() {
		return name;
	}
	public String id() {
		return name1;
	}
}