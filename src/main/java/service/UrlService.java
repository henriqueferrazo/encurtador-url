package service;

import lombok.RequiredArgsConstructor;
import model.Url;
import org.springframework.stereotype.Service;
import urlRepository.UrlRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UrlService {

    private final UrlRepository urlRepository;
    private IDco

    public Url insert(Url url) {
        return urlRepository.save(url);
    }
    public Url findByShortURL(String shortURL) {
        Optional<Url> obj = urlRepository.findByShortUrlLike(shortURL);
        return obj.orElse(null);
    }

}
