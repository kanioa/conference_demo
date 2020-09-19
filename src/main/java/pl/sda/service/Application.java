package pl.sda.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;
import pl.sda.repository.SpeakerRepository;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        // speakerService.setSpeakerRepository(new HibernateSpeakerRepositoryImpl());

        System.out.println(applicationContext.getBean("speakerRepository", SpeakerRepository.class));
//        System.out.println(speakerService.findAll().get(0).getFirstname());

    }
}
