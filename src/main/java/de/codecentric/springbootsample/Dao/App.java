package de.codecentric.springbootsample.Dao;

import lombok.Data;

@Data
public class App {
    private String id;

    private String oriName;

    private String currentName;

    private String appType;

    private String appSubType;

    private String buildState;

    private String IntegrationState;

    private String loginType;

    private String url;
}
