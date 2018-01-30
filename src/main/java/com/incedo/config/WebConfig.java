package com.incedo.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration

public class WebConfig extends WebMvcConfigurerAdapter {
 
    @Override
    public void configureMessageConverters(
      List<HttpMessageConverter<?>> converters) {
     
    	converters.add(new MappingJackson2HttpMessageConverter());
 
        super.configureMessageConverters(converters);
    }
}