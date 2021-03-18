package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;


@Configuration
public class ServiceConfiguration {

    private Map<String, List<Config>> serviceConfigs;

    @PostConstruct
    public void init() {
        Properties properties;

        try {
            properties = new Properties();
            File file = ResourceUtils.getFile("classpath:application.properties");
            InputStream in = new FileInputStream(file);
            properties.load(in);
            serviceConfigs = PropertyConverter.readProperties("service.routes.item1", properties);
            System.out.println(serviceConfigs);
        }
        catch (Exception excep) {

        }
    }

    public Map<String, List<Config>> getServiceConfigs() {
        return serviceConfigs;
    }
}
