package convert;

import DTO.UrlDTO;
import com.encurtadorUrl.encutadorurl.model.Url;
import org.springframework.stereotype.Component;

@Component
public class UrlDTOToUrl {
    public Url convert(UrlDTO urlDTO){
        return Url.builder()
                .original_url(urlDTO.getOriginal_url())
                .build();
    }

}
