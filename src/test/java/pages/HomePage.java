package pages;

import com.microsoft.playwright.Page;
import utilities.ConfigurationReader;
import utilities.DriverFactory;

public class HomePage {

    private Page page;

    public HomePage() {
        this.page = DriverFactory.getPage();
    }

    public void openPage() {
        String url = ConfigurationReader.getProperty("url");
        page.navigate(url);
    }

    public String getTitle() {
        return page.title();
    }
}