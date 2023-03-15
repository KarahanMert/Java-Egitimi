package JavaProje;

public class AsalSayi {

    public static void main(String[] args) {

        // verilen sayinin asal olup olmadigini yazdirin

        int sayi = 13;
        int sayac = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;


            }

        }
        if (sayac > 0) {
            System.out.println(sayi+ " Asal degildir");
        } else {
            System.out.println(sayi+ " Asal sayidir");

        }
    }
}