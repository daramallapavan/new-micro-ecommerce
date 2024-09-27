package com.example.DesignPatterns.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources( {
        @PropertySource( "classpath:datasource.properties"),
        @PropertySource( "classpath:application.properties" )

}

)
@ConfigurationProperties(prefix = "database.properties")
public class JavaConfig {



    private String url;

    private String username;


    private String password;





    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
