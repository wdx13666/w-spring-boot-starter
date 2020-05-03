package com.wdx.wspringbootstarter.config;

import com.wdx.wspringbootstarter.properties.WProperties;
import com.wdx.wspringbootstarter.service.WService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(WProperties.class)
@ConditionalOnProperty(
        prefix = "w",
        name = "isopen",
        havingValue = "true"
)
public class W {

    @Autowired
    private WProperties wProperties;

    @Bean(name = "wService")
    public  WService wService(){
        return new WService(wProperties.getName(),wProperties.getDescriters());
    }
}
