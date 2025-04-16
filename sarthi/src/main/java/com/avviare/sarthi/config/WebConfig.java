package com.avviare.sarthi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // This method will configure the resource handler to serve files from a custom directory
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Serve images from the "D:/product-images/" directory
        registry.addResourceHandler("/product-images/**")  // URL path
                .addResourceLocations("file:/D:/product-images/"); // File system location
    }
}
