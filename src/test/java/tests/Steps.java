package tests;

import cucumber.api.java.en.Given;
import io.qameta.allure.Attachment;

public class Steps {

    @Given("^I eat an orange$")
    public void i_eat_an_orange() {

        attachment("hello");
    }


    @Attachment(value = "attachment", type = "text/json")
    public String attachment(String str) {
        return str;
    }

}
