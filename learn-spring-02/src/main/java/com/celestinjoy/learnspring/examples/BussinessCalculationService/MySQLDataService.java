package com.celestinjoy.learnspring.examples.BussinessCalculationService;

import org.springframework.stereotype.Component;

@Component
class MySQLDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[]{6, 7, 8, 9, 10};
    }
}
