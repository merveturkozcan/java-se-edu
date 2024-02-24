package com.merveturk;

public class String_Split {
    public static void main(String[] args) {
        String haftaninGünleri= "pazartesi,salı,çarşamba,perşembe,cuma,cmtsi,pzr";

        /*Split verilen string ifadeyi arama yapar ve buludugu noktadan stringi parçalara böler.
        * Parçalarınız String[]  şeklinde döner    */


        System.out.println(haftaninGünleri);

        System.out.println("1. gün .....:" + haftaninGünleri.split(",")[0]);
        System.out.println("2. gün .....:" + haftaninGünleri.split(",")[1]);
        System.out.println("3. gün .....:" + haftaninGünleri.split(",")[2]);
    }
}
