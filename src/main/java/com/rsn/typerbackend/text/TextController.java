package com.rsn.typerbackend.text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class TextController {

    @Autowired
    TextRepository textRepository;

    @GetMapping(path = "/text/random/{language_code}")
    public Text getText(@PathVariable(name = "language_code") String languageCode) {
        return textRepository.getRandomText(languageCode);
    }
}
