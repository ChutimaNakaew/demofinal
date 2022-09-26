package com.example.demofinal;

import org.springframework.stereotype.Service;

@Service
public class CalculationPriceService {

    public Double getPrice(Double cost, Double profit) {
        return cost + profit;
    }


}