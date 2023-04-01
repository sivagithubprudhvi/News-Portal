package com.gofortrainings.newsportal.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service = Tiger.class)
public class Tiger {
	
	private static final Logger logger = LoggerFactory.getLogger(Tiger.class);
	
	@Reference
	private Animal animal;

	@Activate
	public void active() {
		logger.info("Newsportal Bundles is activated from Tiger....");
		logger.info("This for Checking  : " + animal.eat("meat"));
	}
	
}