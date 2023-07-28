package practice.generics.method;

import java.util.Arrays;

public class GenericMethods {
    public static void main(String[] args) {
        String[] stdList = {"Ummu", "Umare", "Bulut"};
        Double[] pointList = {43.5, 67.12, 32.6};
        Character[] gradeList = {'A', 'B', 'C', 'D'};

        //1.Tüm listeleri yazdır
        listYazdir(stdList);
        listYazdir(gradeList);
        listYazdir(pointList);
        System.out.println("*******************");


        //2.Öğrencileri isimlerine göre sıralayınız
        sirala(stdList);
        //3.Öğrenci notlarını sıralayınız
        sirala(gradeList);
        //4.Öğrenci harf notlarını sıralayınız
        sirala(pointList);

        //Diziyi yazdıran bir method yazınız
        // Diziyi artan sıralayan bir method yazınız
    }

    //Diziyi yazdıran bir method yazınız
    public static <T> void listYazdir(T[] arr) {
        for (T t : arr) {
            System.out.println(t + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    // Diziyi artan sıralayan bir method yazınız
    public static <T> void sirala(T[] arr) {
        Arrays.stream(arr).sorted().forEach(t -> System.out.print(t + "**"));
        System.out.println();
    }
}
