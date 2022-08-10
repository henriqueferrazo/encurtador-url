package com.encurtadorUrl.encutadorurl.service;

import DTO.UrlDTO;
import lombok.RequiredArgsConstructor;
import model.IDConverter;
import com.encurtadorUrl.encutadorurl.model.Url;
import org.springframework.stereotype.Service;
import com.encurtadorUrl.encutadorurl.repository.UrlRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UrlService {

    private final UrlRepository urlRepository;

    public Url saveUrl(Url url) {
        return urlRepository.save(url);
    }
    public Url findByShortURL(String shortURL) {
        Optional<Url> obj = urlRepository.findByShortUrlLike(shortURL);
        return obj.orElse(null);
    }


}
