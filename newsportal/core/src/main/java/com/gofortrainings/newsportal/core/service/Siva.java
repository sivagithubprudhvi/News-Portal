package com.gofortrainings.newsportal.core.service;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component (immediate=true,service=Siva.class)
@Designate(ocd = PrudhviConfig.class)
public class Siva {

private static final Logger logger = LoggerFactory.getLogger(Siva.class);
	
	@Reference
	private Prudhvi prudhvi;
	
	PrudhviConfig prudhviconfig;

	@Activate
	public void active(	PrudhviConfig prudhviconfig) {
		//logger.info("Newsportal Bundles is activated from Tiger....");
		//logger.info("This for Checking  : " + prudhvi.eat("meat"));
		
		logger.info("This Is your name : " + prudhviconfig.siva());
		logger.info("Select Is your Country : " + prudhviconfig.getCountries());
	}
}

