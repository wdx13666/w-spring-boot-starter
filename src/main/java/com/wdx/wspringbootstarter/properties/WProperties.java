package com.wdx.wspringbootstarter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "w")
public class WProperties {
    private String name;
    private String descriters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriters() {
        return descriters;
    }

    public void setDescriters(String descriters) {
        this.descriters = descriters;
    }
}
