package com.example.demofinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationPriceController {
    @Autowired
    private CalculationPriceService service;

    @RequestMapping(value = "/getPrice/{cost}/{profit}/", method = RequestMethod.GET)
    public Double serviceGetProducts(@PathVariable("cost") Double cost, @PathVariable("profit") Double profit) {
        return service.getPrice(cost, profit);
    }

}
