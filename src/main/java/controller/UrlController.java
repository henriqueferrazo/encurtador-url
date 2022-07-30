package controller;

import model.Url;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UrlController {
    @GetMapping
    public String getByUrl(long id){return "";}

    @PostMapping
    public String createURL(@PathVariable Url url){

    }
}

