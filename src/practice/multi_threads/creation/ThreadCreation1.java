package practice.multi_threads.creation;

public class ThreadCreation1 {/*
      1.Multithreading programlama nedir?

            2.Threadler ...şeklinde oluşturulur.
            1. ....eden alt sınıf oluşturulup, onun ....methodu override edilir,
            2..... implement edilerek, run override edilerek oluşturulur
    ardından .....sınıfının constructorına nesne olarak gönderilir.
3.Run methodunu doğrudan Main methodundan çağırabilir miyiz?
            4.Javada herhangi bir thread oluşturmazsak uygulamalar nerde nasıl çalışır?*/


//Task : Thread sınıfını extend eden Sayac isminde class oluşturup
// bu classta sayıları 1 den 100 e kadar yazdıran günlük olaylardan iki tane thread örneği oluşturunuz

    public static void main(String[] args) {
        //threadleri olustur
        Sayac thread1 = new Sayac("Domates");
        Sayac thread2 = new Sayac("Salatalik");
        //thread leri calistir
        thread1.start();
        thread2.start();



    }  }