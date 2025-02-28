package com.xworkz.app;

import com.xworkz.app.util.TableUtil;
import javafx.scene.control.Tab;

public class TableRunner {

    public static void main(String[] args) {

        Table table = TableUtil.getTable();
        table.setId(1);
        table.setBrand("Ikea");
        table.setCost(6789.00);


        Table table1 = TableUtil.getTable();
        table1.setId(2);
        table1.setBrand("Majama");
        table1.setCost(4578.00);

        System.out.println(table);
        System.out.println(table1);

    }
}
