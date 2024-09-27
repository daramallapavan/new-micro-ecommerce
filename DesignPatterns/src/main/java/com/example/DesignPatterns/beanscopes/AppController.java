package com.example.DesignPatterns.beanscopes;

import com.example.DesignPatterns.DesignPatternsApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    private AppRepository appRepository;

    public AppController(AppRepository appRepository){
        this.appRepository=appRepository;
    }

    @GetMapping("/get")
    public List<String> get(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext( DesignPatternsApplication.class );

        EmailService emailService = applicationContext.getBean( EmailService.class );
        NumberService numberService = applicationContext.getBean( NumberService.class );
        UserService userService=	applicationContext.getBean( UserService.class );

        System.out.println(emailService.getNotificationService());
        System.out.println(numberService.getNotificationService());
        System.out.println(userService.getNotificationService());

        System.out.println(appRepository.toString());
        return  appRepository.getData();
    }
}
