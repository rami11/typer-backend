package com.rsn.typerbackend.text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextService {

    private final TextRepository textRepository;

    @Autowired
    public TextService(TextRepository textRepository) {
        this.textRepository = textRepository;
    }

    public Text getRandomText(String languageCode) {
        return textRepository.selectRandomText(languageCode);
    }
}
