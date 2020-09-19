package pl.sda.service;

import pl.sda.model.Speaker;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;
import pl.sda.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

//    private HibernateSpeakerRepositoryImpl speakerRepository;
    private SpeakerRepository speakerRepository;


    public SpeakerServiceImpl() {
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("constructor");
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.finalAll();
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
