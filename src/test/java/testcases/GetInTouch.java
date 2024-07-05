package testcases;

import org.testng.annotations.Test;
import Pages.GetInTouchPage;
import Utilities.DriverSetup;

public class GetInTouch extends DriverSetup {

    @Test
    public void GetInTouchButtonFunctionality() {
        GetInTouchPage getInTouchPage = new GetInTouchPage();

        getInTouchPage.getInTouchForm(
                "Rakibul",
                "Islam",
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
