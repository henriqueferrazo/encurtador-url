package repository;

import model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UrlRepository extends JpaRepository<Url, Long> {

    List<Url> findByIdLikeByShortUrlLike(long id, String short_url);
}
