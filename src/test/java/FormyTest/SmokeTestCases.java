package FormyTest;

import BestBuyTest.TopNavigationBar;
import org.junit.Test;

public class SmokeTestCases {



    @Test
    public void VerifyAllButtons() throws InterruptedException {
        Buttons button = new Buttons();
        button.Button();
        button.VerifyingPrimaryButton();
    }

    @Test
    public void VeriySubmitForm() throws InterruptedException {
        SubmitForm submitForm = new SubmitForm();

        submitForm.Testcase2();
    }

    @Test
    public void SentKeyToGoogleMethod() throws InterruptedException {

        SendKeyToGoogle sendKeyToGoogle = new SendKeyToGoogle();
        sendKeyToGoogle.GetResultOfAnyProductFromGoogle("Computer");
    }

    @Test
    public void BestBuyNavigationSpecificTab() throws InterruptedException {

        //Object create yada object initate
        //Classname, object name, new keyword, constructor
        TopNavigationBar obj = new TopNavigationBar();
        obj.NavigationBarTabsClickBrands("Brands");


    }



}
