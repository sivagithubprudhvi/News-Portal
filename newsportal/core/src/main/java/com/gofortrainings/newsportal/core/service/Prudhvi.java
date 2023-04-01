package com.gofortrainings.newsportal.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


@Component (immediate=true ,service = Prudhvi.class)
public class Prudhvi {
	
	private static final Logger logger = LoggerFactory.getLogger(Prudhvi.class);

	@Activate
	public void active() {
		logger.info("Newsportal Bundles is activated....");
	}
	@Modified
	public void modified() {
		logger.info("Newsportal Bundles is activated....");
	}
	@Deactivate
	public void deactive() {
		logger.info("Newsportal Bundles is activated....");
	}
	public String eat(String foodType) {
		logger.info("Animal is eatting " + foodType);
		return "Animal is eatting " + foodType;
	}

	

}
