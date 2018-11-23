package tests;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import cucumber.api.java.en.Given;
import io.qameta.allure.Attachment;

public class Steps {

    @Given("^I eat an orange$")
    public void i_eat_an_orange() {
        Config conf = ConfigFactory.load();



        attachment("orange");
    }

    @Given("^I eat an apple")
    public void i_eat_an_apple() {

        attachment("apple");
    }


    @Attachment(value = "attachment", type = "text/json")
    public String attachment(String str) {
        return str;
    }

}
