package com.jr.asset.master.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AssetMasterApiApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AssetMasterApiApplication.class).run(args);
    }
}
