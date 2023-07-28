package practice.generics.classes;

public class StudentList {
    /*---Generic Type---
    Java 5 ile geldi
    Farklı data type lerini ayni yapida kullanabiliyoruz
    Tip güvenliği sagliyor
    CTE verir
 */
    //    Task 1:Java dersi için öğrencileri, isim, vize notu ve final notu ile birlikte listeleyen bir program yazınız
//    Task 2.Kütüphane için öğrencileri isim, okul no ve mail adresi ile birlikte listeleyen bir program yazınız
    public static void main(String[] args) {
        System.out.println("*******  Java Dersi ve Final Notlari  *********");
        ogrenciNotlariListele();
        System.out.println();

        System.out.println("*******  Kutuphane Ogrenci Listesi  *********");
        listMemberLibrary();
    }
    //Ogrencileri notlarini listeleyen bir method
    public static void ogrenciNotlariListele(){
        Student<String,Double,Double> std1 = new Student<>("Ummu", 76.3,98.2);
        Student<String,Double,Double> std2 = new Student<>("Jack", 66.3,68.2);
        Student<String,Double,Double> std3 = new Student<>("Ummuhan", 43.3,18.2);
        System.out.printf("%-11s || %.2f || %.2f \n",std1.getS(),std1.getE(),std1.getV());
        System.out.printf("%-11s || %.2f || %.2f \n",std2.getS(),std2.getE(),std2.getV());
        System.out.printf("%-11s || %.2f || %.2f \n",std3.getS(),std3.getE(),std3.getV());
    }

    //Kutuphan euye listesini yazdiran bir method
    public static void listMemberLibrary(){
        Student<String,Integer,String> std1 = new Student<>("Williams", 500, "william@gmail.com");
        Student<String,Integer,String> std2 = new Student<>("Red Kit", 400, "red kit @gmail.com");
        Student<String,Integer,String> std3 = new Student<>("Rin Tin Tin", 700, "rintintin@gmail.com");
        System.out.printf("%-11s || %-4d || %-20s \n",std1.getS(),std1.getE(),std1.getV());
        System.out.printf("%-11s || %-4d || %-20s \n",std2.getS(),std2.getE(),std2.getV());
        System.out.printf("%-11s || %-4d || %-20s \n",std3.getS(),std3.getE(),std3.getV());

    }
}
