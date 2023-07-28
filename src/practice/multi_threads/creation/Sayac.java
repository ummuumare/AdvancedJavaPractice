package practice.multi_threads.creation;

public class Sayac extends Thread{

    private String name;

    public Sayac(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+ "ekim islemi basladi");

        for (int i = 1; i <=10 ; i++) {
            System.out.println(this.name+ " buyuyor ve boyu " + i + " cm oldu");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(this.name + " buyudu yenmeye hazir");
    }
}