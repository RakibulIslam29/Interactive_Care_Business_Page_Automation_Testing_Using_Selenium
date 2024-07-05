package testcases;

import org.testng.annotations.Test;

import Pages.GetInTouchPage;
import Utilities.DriverSetup;

public class Restriction_for_Numeric_or_Special_Characters_in_First_Name extends DriverSetup{

	@Test
    public void VerifyInputRestrictionforNumericorSpecialCharactersinFirstNameField() {
        GetInTouchPage getInTouchPage = new GetInTouchPage();

        getInTouchPage.getInTouchForm(
                "Rakibul12343#", //numeric character
                "Islam@$@12",
                "01705139111",
                "rakibulislam@gmail.com",
                "InteractiveCare",
                "Mohammadpur, Dhaka, Bangladesh",
                "Less than 500 employees", 
                "100 to 500 trainees", 
                "Training on Selenium Automation",
                "QA Engineer",
                "Interested in setting up training for our team."
        );
    }
}
