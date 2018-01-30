package com.incedo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class IncedoWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		 
		return new Class[]{IncedoConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 
		return new Class[]{IncedoConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		 logger.debug("********getServletMapping*********");
		return new String[]{"/rest/*"};
	}

}
