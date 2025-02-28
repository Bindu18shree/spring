package com.xworkz.springproject;

import com.xworkz.springproject.beans.*;
import com.xworkz.springproject.config.HeadPhonesConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HeadPhonesConfiguration.class);

        HeadPhones headPhones = applicationContext.getBean(HeadPhones.class);

        System.out.println(headPhones);

        Speakers speakers = applicationContext.getBean(Speakers.class);

        System.out.println(speakers);

        SmartWatches smartWatches = applicationContext.getBean(SmartWatches.class);

        System.out.println(smartWatches);

        CoffeeMaker coffeeMaker = applicationContext.getBean(CoffeeMaker.class);

        coffeeMaker.setId(1);
        coffeeMaker.setBrand("Wonderchef");
        coffeeMaker.setColor("Black and Silver");
        coffeeMaker.setPrice(1499.00d);
        coffeeMaker.setCapacityInML(750);
        coffeeMaker.setWattage(600);
        coffeeMaker.setVoltage(230);

        System.out.println(coffeeMaker);

        JuicerMixer juicerMixer = applicationContext.getBean(JuicerMixer.class);

        juicerMixer.setId(1);
        juicerMixer.setBrand("Nutripro");
        juicerMixer.setPrice(1599.00);
        juicerMixer.setNoOfJars(2);
        juicerMixer.setCapacityInL(1.1);

        System.out.println(juicerMixer);

        InductionCookTop inductionCookTop = applicationContext.getBean(InductionCookTop.class);

        inductionCookTop.setId(1);
        inductionCookTop.setBrand("Prestige");
        inductionCookTop.setColor("Black");
        inductionCookTop.setPrice(2049.00);
        inductionCookTop.setMaterialType("Ceramic");
        inductionCookTop.setPowerConsumptionInWatt(1600);

        System.out.println(inductionCookTop);

        ElectricKettle electricKettle = applicationContext.getBean(ElectricKettle.class);

        electricKettle.setId(1);
        electricKettle.setBrand("Agaro");
        electricKettle.setCapacityInML(500);
        electricKettle.setColor("Black and White");
        electricKettle.setPrice(2499.90);

        System.out.println(electricKettle);

        WeighingMachine weighingMachine = applicationContext.getBean(WeighingMachine.class);

        System.out.println(weighingMachine);

        DryIron dryIron = applicationContext.getBean(DryIron.class);

        System.out.println(dryIron);

        TableFan tableFan = applicationContext.getBean(TableFan.class);

        System.out.println(tableFan);

        HairDryer hairDryer = applicationContext.getBean(HairDryer.class);

        System.out.println(hairDryer);

        Trimmer trimmer = applicationContext.getBean(Trimmer.class);

        System.out.println(trimmer);

        HairStraightener straightener = applicationContext.getBean(HairStraightener.class);

        System.out.println(straightener);

        HairCurler curler = applicationContext.getBean(HairCurler.class);

        System.out.println(curler);

        PowerBank powerBank = applicationContext.getBean(PowerBank.class);

        powerBank.setId(1);
        powerBank.setBrand("Duracell");
        powerBank.setNoOfPorts(3);
        powerBank.setNoOfUSBPorts(2);
        powerBank.setPrice(2919.00);

        System.out.println(powerBank);

        LEDBulb ledBulb = applicationContext.getBean(LEDBulb.class);

        System.out.println(ledBulb);

        AirConditioner airConditioner = applicationContext.getBean(AirConditioner.class);

        System.out.println(airConditioner);

        Fragrance fragrance = applicationContext.getBean(Fragrance.class);

        System.out.println(fragrance);

        Refrigerator refrigerator = applicationContext.getBean(Refrigerator.class);

        System.out.println(refrigerator);

        Helmet helmet = applicationContext.getBean(Helmet.class);

        System.out.println(helmet);

        MicrowaveOven microwaveOven = applicationContext.getBean(MicrowaveOven.class);

        System.out.println(microwaveOven);

        DiningTable diningTable = applicationContext.getBean(DiningTable.class);

        System.out.println(diningTable);

        SwingChair swingChair = applicationContext.getBean(SwingChair.class);

        System.out.println(swingChair);

        WallArt wallArt = applicationContext.getBean(WallArt.class);

        System.out.println(wallArt);
    }
}
