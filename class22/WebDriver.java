package class22;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting browser");
    }public void openURL(){
        System.out.println("opening a URL");
    }
public void testLoginPage(){
    System.out.println("checking if login page works");}
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Google Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL in Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the lgoin page in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }}
class Safari extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Starting the Safari Browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the lgoin page in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Safari Browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the lgoin page in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}