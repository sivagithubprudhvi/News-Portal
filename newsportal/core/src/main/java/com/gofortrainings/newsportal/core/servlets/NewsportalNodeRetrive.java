package com.gofortrainings.newsportal.core.servlets;

import java.io.IOException;
import java.util.List;

import javax.jcr.Node;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
//import org.apache.sling.api.servlets.SlingsafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@Component(service = Servlet.class, immediate = true)
@SlingServletResourceTypes(resourceTypes = "newsportal/components/page", extensions = "txt",selectors="abc")
//@SlingServletPaths("newsportal/components/helloworld")
public class NewsportalNodeRetrive extends SlingSafeMethodsServlet {

	private static final Logger log = LoggerFactory.getLogger(FirstServlet.class);
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
	
	//	response.getWriter().write("From the get: server name is : " + request.getServerName() + "and server port is : " + request.getServerPort());
		try {
        ResourceResolver resource=request.getResourceResolver();
        Resource nodeRes = resource.getResource("/content/dammyTest");
        
        
        //JCR
        
        Node infoNode = nodeRes.adaptTo(Node.class);
        infoNode.getProperties("name");	
        infoNode.setProperty("testNode", "nodeval");
        
        //Sling
        ValueMap infoVM = nodeRes.getValueMap();
		infoVM.get("name", String.class);
		ModifiableValueMap map = nodeRes.adaptTo(ModifiableValueMap.class);
		map.put("modifyVM", "This is a modify VM");
		nodeRes.getResourceResolver().commit();
		response.getWriter().write("From node : " + infoNode.getProperties("name").toString() + "from sling : " + infoVM.get("name", String.class));
		}
		catch(Exception e) {
			log.info("There is an error in FirstServlet: " + e.getMessage());	
		}
	}
	
	
	
	
}