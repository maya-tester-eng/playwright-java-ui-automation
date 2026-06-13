package pages;

import com.microsoft.playwright.Page;
import utilities.DriverFactory;

    public class SupportPage {

        private final Page page;

        private final String nameInput = "#name";  //final, because The locator value should not change during test execution, so I made it final to prevent accidental modification.
        private final String emailInput = "#email";
        private final String messageTextarea = "#message";
        private final String submitButton = "#submitBtn";

        private String alertMessage;

        public SupportPage() {
            this.page = DriverFactory.getPage();
        }

        public void enterName(String name) {
            page.locator(nameInput).fill(name);
        }

        public void enterEmail(String email) {
            page.locator(emailInput).fill(email);
        }

        public void enterMessage(String message) {
            page.locator(messageTextarea).fill(message);
        }

        public void submitSupportForm() {

            page.onDialog(dialog -> {
                if (dialog.type().equals("prompt")) {
                    dialog.accept("Maya");
                } else {
                    alertMessage = dialog.message();
                    dialog.accept();
                }
            });

            page.locator(submitButton).click();
        }

        public String getAlertMessage() {
            return alertMessage;
        }
    }

