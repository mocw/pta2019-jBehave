import java.net.MalformedURLException;
import java.net.URL;

public class storiesURL {
    private storiesURL() {}
    public static URL getstoriesURL(){
        URL storyURL = null;
        try {
            storyURL = new URL("file://" + System.getProperty("user.dir") + "" +
                    "\\src\\test\\resources\\stories");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return storyURL;
    }
}
