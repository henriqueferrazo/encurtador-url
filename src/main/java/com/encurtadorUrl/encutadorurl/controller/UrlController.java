package com.encurtadorUrl.encutadorurl.controller;

import DTO.UrlDTO;
import com.encurtadorUrl.encutadorurl.model.Url;
import com.encurtadorUrl.encutadorurl.service.UrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/encurtadorUrl/")
public class UrlController {

    private final ConversionService conversionService;

    private final UrlService urlService;


    @PostMapping(path="/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UrlDTO createURL(@Valid @RequestBody UrlDTO urlDTO){
        log.info("Encurtando URL: [{}]", urlDTO);
        var url = conversionService.convert(urlDTO, Url.class );
        var saveURL = urlService.saveUrl(url);
        return convert(saveURL);
    }

//    @GetMapping(path="{id}")
//    public UrlDTO

    public UrlDTO convert(Url url){
        return conversionService.convert(url, UrlDTO.class);
    }
}

