package com.xworkz.springproject.config;

import com.xworkz.springproject.beans.Helmet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springproject")
public class HeadPhonesConfiguration {

    @Bean
    public Helmet getHelmet() {

        Helmet helmet = new Helmet(1, "Vega", "Black", 1299.90);

        return helmet;
    }

}
