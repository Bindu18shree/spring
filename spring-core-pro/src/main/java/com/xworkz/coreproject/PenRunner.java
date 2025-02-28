package com.xworkz.coreproject;

import com.xworkz.coreproject.beans.*;
import com.xworkz.coreproject.config.PenConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class PenRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PenConfiguration.class);
        Pen pen = applicationContext.getBean(Pen.class);

//        pen.setId(1);
//        pen.setBrand("Octane");
//        pen.setPrice(20.0);

        System.out.println(pen);


        Laptop laptop = applicationContext.getBean(Laptop.class);

        laptop.setId(1);
        laptop.setBrand("Dell");
        laptop.setPrice(85980.980);

        System.out.println(laptop);

        Bag bag = applicationContext.getBean(Bag.class);

        bag.setId(1);
        bag.setBrand("Wildcraft");
        bag.setPrice(2765.90);

        System.out.println(bag);

        Car car = applicationContext.getBean(Car.class);

        car.setId(1);
        car.setName("Thar");
        car.setPrice(32899.00);
        car.setColor("Black");

        System.out.println(car);

        Watch watch = applicationContext.getBean(Watch.class);

        watch.setId(1);
        watch.setBrand("Fossil");
        watch.setPrice(7999.00);

        System.out.println(watch);

        String string = applicationContext.getBean("getString",String.class);
        System.out.println(string);

        String string1 = applicationContext.getBean("st",String.class);
        System.out.println(string1);

        Integer integer = applicationContext.getBean(Integer.class);
        System.out.println(integer);

        Long aLong = applicationContext.getBean(Long.class);
        System.out.println(aLong);

        Short aShort = applicationContext.getBean(Short.class);
        System.out.println(aShort);

        Double aDouble = applicationContext.getBean(Double.class);
        System.out.println(aDouble);

        Float aFloat = applicationContext.getBean(Float.class);
        System.out.println(aFloat);

        Character character = applicationContext.getBean(Character.class);
        System.out.println(character);

        Byte aByte = applicationContext.getBean(Byte.class);
        System.out.println(aByte);

        Boolean aBoolean = applicationContext.getBean(Boolean.class);
        System.out.println(aBoolean);

        List list = applicationContext.getBean(List.class);
        list.add(21);
        list.add(32);
        list.add(66);   
        System.out.println(list);

    }
}
