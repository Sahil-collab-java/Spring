package com._Redis.Controller;

import com._Redis.Model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
public class CountryController {

    private HashOperations<String,Integer,Country> hashOperations;

    @Autowired
    public CountryController(RedisTemplate<String, Country> redisTemplate){

        this.hashOperations = redisTemplate.opsForHash();
    }

    @PostMapping("/country")
    public String country(@RequestBody Country country){
        hashOperations.put("COUNTRIES",country.getSrNo(),country);
        return "Country Added";
    }

    @GetMapping("/getCountries")
    public Collection<Country> getCountries(){
        Map<Integer,Country> countryMap = hashOperations.entries("COUNTRIES");
        Collection<Country> countries = countryMap.values();
        return  countries;
    }
}
