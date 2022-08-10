package convert;

import DTO.UrlDTO;
import com.encurtadorUrl.encutadorurl.model.Url;
import org.springframework.stereotype.Component;

@Component
public class UrlToUrlDTO {

    public UrlDTO convert(Url url){
        return UrlDTO.builder()
                .original_url(url.getOriginal_url())
                .build();
    }

}
