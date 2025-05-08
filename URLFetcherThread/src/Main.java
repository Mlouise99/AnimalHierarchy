//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        URLFetcherThread urlFetcherThread = new URLFetcherThread("https://www.shecancodeschool.org/courses");
        URLFetcherThread Url1thread = new URLFetcherThread("https://igirerwanda.org/");
        Thread t1 = new Thread(urlFetcherThread);
        Thread t2 = new Thread(Url1thread);
        t1.setName("FetcherThread-1");
        t1.start();
        System.out.println(t1.getName());
        try {

            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        t2.start();

        t2.setName("FetcherThread-2");

        System.out.println(t2.getName());
        System.out.println("Main thread continues processing...");

        try {

            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

    }
}