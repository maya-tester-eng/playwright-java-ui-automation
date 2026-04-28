package utilities;

import com.microsoft.playwright.*;

public class DriverFactory {

    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    public static Page getPage() {
        if (page == null) {
            String browserName = ConfigurationReader.getProperty("browser");
            boolean headless = Boolean.parseBoolean(ConfigurationReader.getProperty("headless"));

            playwright = Playwright.create();

            BrowserType.LaunchOptions options = new BrowserType.LaunchOptions()
                    .setHeadless(headless);

            switch (browserName.toLowerCase()) {
                case "chromium":
                    browser = playwright.chromium().launch(options);
                    break;
                case "firefox":
                    browser = playwright.firefox().launch(options);
                    break;
                case "webkit":
                    browser = playwright.webkit().launch(options);
                    break;
                default:
                    throw new RuntimeException("Unsupported browser: " + browserName);
            }

            context = browser.newContext();
            page = context.newPage();
        }

        return page;
    }

    public static void closeBrowser() {
        if (page != null) {
            page.close();
            page = null;
        }

        if (context != null) {
            context.close();
            context = null;
        }

        if (browser != null) {
            browser.close();
            browser = null;
        }

        if (playwright != null) {
            playwright.close();
            playwright = null;
        }
    }
}