package com.xworkz.app.util;

import com.xworkz.app.Table;

public class TableUtil {

    private static Table table = null;

    public static Table getTable(){
        return table;
    }

    static {
       table = new Table();
    }


}
