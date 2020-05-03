package com.wdx.wspringbootstarter.service;


public class WService {
    public String name;
    public String desc;

    public WService(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String say(){
        return this.name + "!" + desc;
    }
}
