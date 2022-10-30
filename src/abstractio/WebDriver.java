//package abstractio;
//
//public interface WebDriver {
//    /*
//    Create a WebDriver Interface that will have the following unimplemented behaviour:
//    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
//    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
//     */
//    void openBrowser();
//    void closeBrowser();
//    void maximizeWindow();
//    void findElement();
//}
//class ChromeDriver implements WebDriver {
//    @Override
//    public void openBrowser() {
//        System.out.println("Double click on the Chrome browser to open");
//    }
//    @Override
//    public void closeBrowser() {
//        System.out.println("Click on X to Chrome close the browser");
//    }
//    @Override
//    public void maximizeWindow() {
//        System.out.println("click on the [] button on the top right corner");
//    }
//    @Override
//    public void findElement() {
//        System.out.println("Ctrl+F to find the elements");
//    }
//}
//class FirefoxDriver implements WebDriver {
//
//    @Override
//    public void openBrowser() {
//        System.out.println("Double click on the FireFox browser to open");
//    }
//
//    @Override
//    public void closeBrowser() {
//        System.out.println("Click on X to FireFox close the browser");
//    }
//
//    @Override
//    public void maximizeWindow() {
//        System.out.println("click on Maximize");
//    }
//
//    @Override
//    public void findElement() {
//        System.out.println("Click on the Find from the drop down menu. Edit > Find");
//
//    }
//}
