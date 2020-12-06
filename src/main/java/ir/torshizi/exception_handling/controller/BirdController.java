package ir.torshizi.exception_handling.controller;

import ir.torshizi.exception_handling.entity.Bird;
import ir.torshizi.exception_handling.exception_handling.exceptions.EntityNotFoundException;
import ir.torshizi.exception_handling.service.BirdService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/birds")
public class BirdController {

    private final BirdService birdService;
    public BirdController(BirdService birdService) {
        this.birdService = birdService;
    }

    @GetMapping(value = "/{birdId}")
    public Bird getBird(@PathVariable("birdId") Long birdId) throws EntityNotFoundException {
        return birdService.getBird(birdId);
    }

    @GetMapping(value = "/params")
    public Bird getBirdRequestParam(@RequestParam("birdId") Long birdId) throws EntityNotFoundException {
        return birdService.getBird(birdId);
    }

    @GetMapping(value = "/noexception/{birdId}")
    public Bird getBirdNoException(@PathVariable("birdId") Long birdId) throws EntityNotFoundException {
        return birdService.getBirdNoException(birdId);
    }


    @PostMapping
    public Bird createBird(@RequestBody @Valid Bird bird) {
        return birdService.createBird(bird);
    }

}
