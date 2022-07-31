package service;

import lombok.RequiredArgsConstructor;
import model.IDConverter;
import model.Url;
import org.springframework.stereotype.Service;
import repository.UrlRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UrlService {

    private final UrlRepository urlRepository;
    private final IDConverter converter = IDConverter.getInstance();

    public Url saveUrl(Url url) {
        return urlRepository.save(url);
    }
    public Url findByShortURL(String shortURL) {
        Optional<Url> obj = urlRepository.findByShortUrlLike(shortURL);
        return obj.orElse(null);
    }

    public Url insert(Url obj) {
        obj.setId(null);
        obj = urlRepository.save(obj);
        obj.setShort_url(converter.toBase62(String.valueOf(obj.getId())));
        return urlRepository.save(obj);
    }

}
