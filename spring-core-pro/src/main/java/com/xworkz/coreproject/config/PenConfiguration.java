package com.xworkz.coreproject.config;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.coreproject")
public class PenConfiguration {

    @Bean
    public String getString(){
        return new String("Hello World");
    }

    @Bean("st")
    public String getStringValue(){
        return new String("Sai Baba");
    }

    @Bean
    public Integer getIntegerValue(){
        Integer integer = 32;
        return integer;
    }

    @Bean
    public Long getLongValue(){
        Long aLong = 546789789L;
        return aLong;
    }

    @Bean
    public Short getShortValue(){
        Short aShort = 12;
        return aShort;
    }

    @Bean
    public Byte getByteValue(){
        Byte aByte = 32;
        return aByte;
    }

    @Bean
    public Character getCharValue(){
        Character character = 'A';
        return character;
    }

    @Bean
    public Boolean getBooleanValue(){
        return true;
    }

    @Bean
    public Double getDoubeValue(){
        Double aDouble = 5463.980d;
        return aDouble;
    }

    @Bean
    public Float getFloatValue(){
        Float aFloat = 43.7f;
        return aFloat;
    }

    @Bean
    public List getListOfIntegers(){
        return new ArrayList();
    }




}
