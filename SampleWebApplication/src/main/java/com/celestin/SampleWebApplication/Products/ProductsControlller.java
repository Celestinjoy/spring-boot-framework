package com.celestin.SampleWebApplication.Products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductsControlller {
    @RequestMapping(value = "men",method = RequestMethod.GET)
    public String goToMen(){
        return "men";
    }

    @RequestMapping(value = "women",method = RequestMethod.GET)
    public String goToWomen(){
        return "women";
    }
    @RequestMapping(value = "kids",method = RequestMethod.GET)
    public String goToKids(){
        return "kids";
    }
    @RequestMapping(value = "babies",method = RequestMethod.GET)
    public String goToBabies(){
        return "babies";
    }

}
