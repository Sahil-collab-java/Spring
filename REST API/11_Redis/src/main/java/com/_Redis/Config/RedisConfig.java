package com._Redis.Config;

import com._Redis.Model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){
        JedisConnectionFactory connectionFactory =  new JedisConnectionFactory();
        return  connectionFactory;
    }

    @Bean
    public RedisTemplate<String, Country> redisTemplate(){
        RedisTemplate<String,Country> countryRedisTemplate  =  new RedisTemplate<>();
        countryRedisTemplate.setConnectionFactory(jedisConnectionFactory());

        return  countryRedisTemplate;
    }
}
