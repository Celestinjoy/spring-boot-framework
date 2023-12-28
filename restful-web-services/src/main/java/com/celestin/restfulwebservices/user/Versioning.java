package com.celestin.restfulwebservices.user;

import org.springframework.web.bind.annotation.GetMapping;

public class Versioning {

    // URI versioning

    @GetMapping("/v1/person")
    public void urigetVersion1() {
        System.out.println("this is v1");
    }

    @GetMapping("/v2/person")
    public void urigetVersion2() {
        System.out.println("this is v2");
    }

    //parameter versioning

    @GetMapping(path ="/person", params = "version=1")
    public void parametVersion() {
        System.out.println("this is v1");
    }

    @GetMapping(path ="/person", params = "version=2")
    public void paramgetVersion2() {
        System.out.println("this is v2");
    }

    // url to be typed == http://localhost:8080/person?version=1

    //header versioning

    @GetMapping(path ="/person", headers = "version=1")
    public void headeretVersion() {
        System.out.println("this is v1");
    }

    @GetMapping(path ="/person", headers = "version=2")
    public void headergetVersion2() {
        System.out.println("this is v2");
    }

}
