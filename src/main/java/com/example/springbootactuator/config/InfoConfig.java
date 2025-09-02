package com.kleber.actuator.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InfoConfig implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        Map<String, Object> details = new HashMap<>();
        details.put("author", "Kleber");
        details.put("project", "Spring Boot Actuator Demo");
        details.put("version", "1.0.0");
        builder.withDetail("app-info", details);
    }
}
