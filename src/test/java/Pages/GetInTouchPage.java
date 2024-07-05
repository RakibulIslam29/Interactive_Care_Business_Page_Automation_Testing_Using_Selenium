package Pages;

import org.openqa.selenium.By;

public class GetInTouchPage extends BasePage {

    public static final String GET_IN_TOUCH_URL = "https://www.interactivecares.com/business";

    public By GET_IN_TOUCH_BUTTON = By.xpath("//span[@class='text-[16px]']");
    public By FIRST_NAME = By.xpath("//input[@placeholder='Enter your First Name']");
    public By LAST_NAME = By.xpath("//input[@placeholder='Enter your Last Name']");
    public By PHONE_NUMBER = By.xpath("//input[@placeholder='Enter your Phone Number']");
    public By EMAIL_ADDRESS = By.xpath("//input[@placeholder='Enter your Email Address']");
    public By COMPANY_NAME = By.xpath("//input[@placeholder='Enter your Company Name']");
    public By COMPANY_ADDRESS = By.xpath("//input[@placeholder='Enter your Company Address']");
    public By COMPANY_SIZE = By.xpath("//div[@role='dialog']//div[1]//select[1]");
    public By EXPECTED_NUMBER_OF_TRAINEES = By.xpath("//div[@role='dialog']//div//div[2]//select[1]");
    public By TOPIC_OF_TRAINING = By.xpath("//input[@placeholder='Enter your Preferred Topic']");
    public By YOUR_ROLE = By.xpath("//input[@placeholder='Enter your Role']");
    public By DESCRIPTION = By.xpath("//textarea[@placeholder='Enter your Description']");
    public By GET_IN_TOUCH_SUBMIT = By.xpath("//button[@type='submit']//span[contains(text(),'Get in Touch')]");

    public void getInTouchForm(String firstName, String lastName, String phoneNumber, String emailAddress, String companyName, String companyAddress, String companySize, String numberOfTrainees, String topicOfTraining, String yourRole, String description) {
        navigateTo(GET_IN_TOUCH_URL);
        clickOnElement(GET_IN_TOUCH_BUTTON);
        writeText(FIRST_NAME, firstName);
        writeText(LAST_NAME, lastName);
        writeText(PHONE_NUMBER, phoneNumber);
        writeText(EMAIL_ADDRESS, emailAddress);
        writeText(COMPANY_NAME, companyName);
        writeText(COMPANY_ADDRESS, companyAddress);
        selectDropdownByVisibleText(COMPANY_SIZE, companySize);
        selectDropdownByVisibleText(EXPECTED_NUMBER_OF_TRAINEES, numberOfTrainees);
        writeText(TOPIC_OF_TRAINING, topicOfTraining);
        writeText(YOUR_ROLE, yourRole);
        writeText(DESCRIPTION, description);
        clickOnElement(GET_IN_TOUCH_SUBMIT);
    }

}
