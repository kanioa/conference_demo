package pl.sda.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.AppConfig;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;
import pl.sda.repository.SpeakerRepository;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService.findAll().get(0).getFirstname());

    }
}
