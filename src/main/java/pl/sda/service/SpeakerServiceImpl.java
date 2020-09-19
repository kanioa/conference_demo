package pl.sda.service;

import pl.sda.model.Speaker;
import pl.sda.repository.HibernateSpeakerRepositoryImpl;
import pl.sda.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private HibernateSpeakerRepositoryImpl speakerRepository;

    public SpeakerServiceImpl() {
    }

    public SpeakerServiceImpl(HibernateSpeakerRepositoryImpl speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.finalAll();
    }

    public void setSpeakerRepository(HibernateSpeakerRepositoryImpl speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
