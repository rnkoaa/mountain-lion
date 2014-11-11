package com.richard.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by rnkoaa on 11/10/14.
 */
//@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    private static Log logger = LogFactory.getLog(WebConfig.class);

    /*@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }
*/
    @Bean
    protected ServletContextListener listener() {
        return new ServletContextListener() {
            @Override
            public void contextInitialized(ServletContextEvent sce) {
                logger.info("Servlet Context Initialied");
            }

            @Override
            public void contextDestroyed(ServletContextEvent sce) {
                logger.info("Servlet Context Destroyed");
            }
        };
    }
}
