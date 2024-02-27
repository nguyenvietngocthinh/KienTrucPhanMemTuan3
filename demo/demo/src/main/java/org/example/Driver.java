package com.fit.iuh;

import java.io.File;
import java.util.List;

public class Driver {
    public static void main(String[] args) throws Exception {
        LCOM4Cal calculation = new LCOM4Cal();
        File file = new File(
                "F:\\20065261_NguyenVietNgocThinh_THTuan3\\demo\\src\\main\\java\\com\\fit\\iuh\\CBOMetric.java");
        List<Group> lst = calculation.loadGroups(file);
        lst.forEach(System.out::println);
        int lcom4 = calculation.loadGroups(file).size();
        System.out.printf("LCOM4 of class %s is %d\n", file.getName(), lcom4);
    }
}
