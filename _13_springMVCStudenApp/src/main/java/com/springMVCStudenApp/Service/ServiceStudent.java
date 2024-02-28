package com.springMVCStudenApp.Service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceStudent {

    public List<String> getCoureses(){
        return Arrays.asList("java","python","c++","c");
    }
    public List<String> getTimings(){
        return Arrays.asList("evening","morning","night");
    }
}
