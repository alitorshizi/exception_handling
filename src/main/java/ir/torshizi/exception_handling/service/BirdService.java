package ir.torshizi.exception_handling.service;

import ir.torshizi.exception_handling.entity.Bird;
import ir.torshizi.exception_handling.exception_handling.exceptions.EntityNotFoundException;
import ir.torshizi.exception_handling.repository.BirdRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BirdService {

    private final BirdRepository birdRepository;
    public BirdService(BirdRepository birdRepository) {
        this.birdRepository = birdRepository;
    }

    public Bird getBirdNoException(Long birdId) {
        return birdRepository.findById(birdId).get();
    }

    public Bird getBird(Long birdId) {
        Optional<Bird> bird = birdRepository.findById(birdId);
        if (bird.isEmpty()) {
            throw new EntityNotFoundException(Bird.class, "id", birdId.toString());
        }
        return bird.get();
    }

    public Bird createBird(Bird bird) {
        return birdRepository.save(bird);
    }
}
