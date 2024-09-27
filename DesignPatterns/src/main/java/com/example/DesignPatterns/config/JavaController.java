package com.example.DesignPatterns.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

    Logger log= LoggerFactory.getLogger( JavaController.class );

    @Autowired
    JavaConfig javaConfig;
    @GetMapping("/getData")
    public String getData(){

       String userName= javaConfig.getUsername();

     String password=  javaConfig.getPassword();


        log.info( " username :{}, password: {} , applicationName {}" , userName,password);

        return userName+" "+password+" ";
    }
}
