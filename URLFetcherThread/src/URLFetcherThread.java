import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;


public class URLFetcherThread implements Runnable {
    String URLName;

    public URLFetcherThread(String URLName) {
        this.URLName = URLName;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        try {
            URL url = new URL(URLName);
            BufferedReader file = new BufferedReader(new java.io.InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = file.readLine()) != null) {
                System.out.println( "Thread"+ " "+  threadName +inputLine);

            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
