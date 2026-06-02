package pages;

import utilities.DriverFactory;
import com.microsoft.playwright.Dialog;
import com.microsoft.playwright.Page;


public class LoginPage {

        private Page page;

        private String loginEmailInput = "#loginEmail";
        private String passwordInput = "#password";
        private String loginButton = "#loginBtn";

        private String alertMessage;

        public LoginPage() {
            this.page = DriverFactory.getPage();
        }

        public void enterLoginEmail(String email) {
            page.locator(loginEmailInput).fill(email);
        }

        public void enterLoginPassword(String password) {
            page.locator(passwordInput).fill(password);
        }

        public void clickLoginButton() {
            page.onceDialog(dialog -> {
                alertMessage = dialog.message();
                dialog.accept();
            });

            page.locator(loginButton).click();
        }

        public String getAlertMessage() {
            return alertMessage;
        }
    }

