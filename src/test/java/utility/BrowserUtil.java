package utility;

public class BrowserUtil {

    public static void seconds(int num)  {

        try {
            Thread.sleep(num * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
