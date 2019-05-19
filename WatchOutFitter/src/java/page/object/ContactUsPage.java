package page.object;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ContactUsPage extends ApplicationPageBase {
    @FindBy(xpath = "//a[contains(@class,'top-link')][contains(text(),'Contact Us')]")
    private WebElement contactUsLink;

    @FindBy(xpath = "//input[@placeholder='Type your name']")
    private WebElement fullname;

    @FindBy(xpath = "//input[@placeholder='Type your email']")
    private WebElement email;

    @FindBy(xpath = "//textarea[@name='field[2]']")
    private WebElement message;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[3]/a")
    private WebElement activeCampaignLink;

    @FindBy(id = "_form_1_submit")
    private WebElement submitButton;

    @FindBy(id = "_form_1_submit")
    private WebElement verifysubmitButton;
    public void contactUs() {
        click(contactUsLink, "contactUsLink");
        sendKeys(fullname, "FullName", "Sesire");
        sendKeys(email, "email", "Sesire22@gmail.com");
        sendKeys(message, "messageBox", "This is a test case");
        click(submitButton, "submitButton");

    }

    public WebElement getVerifySubmitButton() {
        TestLogger.log("submit button is displayed");
        return verifysubmitButton;


    }
}
