package test.page.object;


import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.object.ContactUsPage;
import org.testng.TestNG;



public class ContactUsTest extends ApplicationPageBase {
    ContactUsPage objOfContactUsPage = null;
    @BeforeMethod
    public void initializationOfElements() {
        objOfContactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
    }

    @Test
    public void contactUsLinkTest() {
        objOfContactUsPage.contactUs();
        Assert.assertTrue(objOfContactUsPage.getVerifySubmitButton().isDisplayed());

    }












}
