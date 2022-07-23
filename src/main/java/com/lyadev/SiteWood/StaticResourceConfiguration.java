package com.lyadev.SiteWood;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
    public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {

            String filePath = "upload-dir";
            registry.addResourceHandler("/img/**")
                    .addResourceLocations("file:/"+filePath)
                    .setCachePeriod(0);
        }
    }

