package com.tongjiaqian.util;

import java.util.Random;
import java.util.Scanner;

public class DataProductUtil {
    public static void main(String[] args) {
        String[] brand = {"vivo","oppo","huawei","samsung","apple","xiaomi"};
        String[] model = {"p40","p50","p40 pro","p30","p40 pro","X80","X60","X50 pro","X60 pro","X70","X80 pro","S20","S21","S22","S20 ultra","S22 pro","S21 ultra"};
        String[] soc = {"Kirin 990","Kirin 980","Kirin 985","Kirin 9000","Qualcomm Snapdragon 888","Qualcomm Snapdragon 865","Qualcomm Snapdragon 870","Qualcomm Snapdragon 888 plus","Qualcomm Snapdragon 865 plus","MediaTek 9000","MediaTek 8000","MediaTek 800","MediaTek 800U"};
        Integer[] price = {2000,3000,4000,5000,2999,3999,4999,5999,6999,2699,3699,4699,5699,4399,2499,2699,5399,5199};

        int nbrand = brand.length;
        int nmodel = model.length;
        int nsoc = soc.length;
        int nprice = price.length;

        Scanner in = new Scanner(System.in);
        System.out.println("要多少条数据？");
        int i = in.nextInt();
        Random random = new Random();
        while(i!=0){
            random = new Random();
            int i1 = random.nextInt(nbrand);
            int i2 = random.nextInt(nmodel);
            int i3 = random.nextInt(nsoc);
            int i4 = random.nextInt(nprice);
            System.out.println("insert into phonebrand values (null,'"+brand[i1]+"','"+model[i2]+"','"+soc[i3]+"',"+price[i4]+");");
            i--;
        }

        //insert into phonebrand values (null,'huawei','p50 pro','kirin 990',4399);
    }
}
