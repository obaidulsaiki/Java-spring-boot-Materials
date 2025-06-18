package com.StudentManagment.System.Topic07_BeanAndConfigure.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    @Bean // storing the new Car() into IOC container
    public Car car(){
        return new Car();
    }
}

