package service;

import lombok.RequiredArgsConstructor;
import model.Url;
import org.springframework.stereotype.Service;
import repository.UrlRepository;

@Service
@RequiredArgsConstructor
public class UrlService {

    private final UrlRepository urlRepository;

    public Url createShortUrl(Url url){
        return urlRepository.save(url);
    }

}
