package pl.sda.service;

import pl.sda.model.Speaker;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private HibernateSpeakerRepositoryImpl speakerRepository;

    @Override
    public List<Speaker> findAll(){
        return  speakerRepository.finalAll();

    }

    public void setSpeakerRepository(HibernateSpeakerRepositoryImpl speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
