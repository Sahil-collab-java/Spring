package com.Sahil.Service;

import org.springframework.stereotype.Component;

@Component
public class Chip {
    public Chip() {
        System.out.println("Chip contractor is called.......");
    }

    public String getChipType(){
        return "32-BIt";
    }
}
