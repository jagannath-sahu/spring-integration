package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class PropertyConverter {

  public static Map<String, List<Config>> readProperties(final String key, final Properties properties) {

    Map<String, List<Config>> configs;
    final Map<String, String> services = new HashMap<>();

    properties.forEach((name, property) -> {
        if (((String)name).contains(key)) {
            services.put((String)name, (String)property);
        }
    });

    configs = services.entrySet().stream().map(service -> {
        Config serviceConfig;
        String value;

        String values[];

        value = service.getValue().substring(1, service.getValue().length() - 1);

        values = value.split(",");

        serviceConfig = new Config();
        serviceConfig.setServiceName(values[0].trim());
        serviceConfig.setServiceType(values[1].trim());
        serviceConfig.setServicePath(values[2].trim());
        serviceConfig.setRequired(values[3].trim().equals("1"));

        return serviceConfig;
    }).collect(Collectors.groupingBy(Config::getServiceName));

    return configs;
  }

}
