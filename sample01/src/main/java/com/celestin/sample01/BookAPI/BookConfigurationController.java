package com.celestin.sample01.BookAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookConfigurationController {
    @Autowired
    private AppProperties appProperties;

    @RequestMapping("/info")
    public AppProperties retrieveCredentials() {
        return appProperties;
    }
}
