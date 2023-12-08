package com.celestinjoy.learnspring.examples.BussinessCalculationService;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BussinessCalculationService {

    private DataService dataService;


    public BussinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
