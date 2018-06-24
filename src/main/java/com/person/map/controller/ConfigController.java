package com.person.map.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="my")
public class ConfigController {
	
	Logger logger = LoggerFactory.getLogger(ConfigController.class);
	
    private String name;

    private int age;

    private String location;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
	
	@RequestMapping("/getConfig")
	public void getConfig() {
		 logger.info("my name is "+name+", "+ age +" years old, "+location);

	}

}
