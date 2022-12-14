package com.encurtadorUrl.encutadorurl.repository;

import com.encurtadorUrl.encutadorurl.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UrlRepository extends JpaRepository<Url, String> {

    Optional<Url> findByShortUrlLike(String short_url);

}
