package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ServletInitializer implements WebApplicationInitializer {

    private Logger logger = LoggerFactory.getLogger(ServletInitializer.class);
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        logger.info("ServletInitializer on startup");
    }
}
