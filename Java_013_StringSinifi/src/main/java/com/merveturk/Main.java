package com.merveturk;

public class Main {

    // Class dışına değişken tanımlayabiliriz.
    // Static kullanarak tanımlandığı için belekte adreslenmiş halde tanımlanır.Bu nedenele initilaze etmeye gerek yoktur.
    // İlk değeri 0 olur.


    private static int sayi2;

    public static void main(String[] args) {

        /**
         * primitive data type : ram de stack tarafında depolanırlar ve çok hızlı erişim sağlanır performansı yüksektir.
         * referance data type : Bunlar java sınıflarıdır.
         * String Sınıfı da Referance tiplerin içerisine girer.
         * Ram de heap tarafında tutulur bunun performansı stack e göre daha maliyetlidir.
         * Ancak heap genişliği kadar genişleyebilirler.
         * Önemli !! primitive data type lar boş şekilde başlatılamaz kullanılamazlar.
         * Önemli !! referance data type lar boş olarak başlatılabilir.
        **/

        String ifade= "Merhaba bugün hava çok güzel";
        String ifade2= null;  //heap alanında işaret edilen bir alan yoktur.
        String ifade3= ""; // heap alanında işaret edilen yer vardır ve boş bir değere sahiptir.


        int sayi;  // bu değişkende hata alırsın  initalize etmek zorundasın çünkü









        }
    }