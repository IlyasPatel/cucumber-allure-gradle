package tests;

import com.github.racc.tscg.TypesafeConfig;
import com.github.racc.tscg.TypesafeConfigModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import cucumber.api.java.en.Given;
import io.qameta.allure.Attachment;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Steps {

    @Inject
    private World world;

    @TypesafeConfig("simple-app.answer")
    public int answer;

    public Steps() {
        //Config config = ConfigFactory.parseFile(new File("/Users/ipatel/development/learning/cucumber/personal_git_repo/cucumber-allure-gradle/src/test/resources/application.conf"));
        Config config = ConfigFactory.load();
        Injector injector = Guice.createInjector(
                TypesafeConfigModule.fromConfigWithPackage(config, "tests.com.apple")
        );
        //System.out.println(injector.getInstance(Injectable.class));
        System.out.println();

    }

    @Given("^I eat an orange$")
    public void i_eat_an_orange() {
        Config conf = ConfigFactory.load();
        int bar1 = conf.getInt("simple-app.answer");
        Config foo = conf.getConfig("simple-app");
        int bar2 = foo.getInt("answer");
        world.setNumber(1);

        attachment("orange");
    }

    @Given("^I eat an apple")
    public void i_eat_an_apple() {
        world.setNumber(1);
        attachment("apple");
    }


    @Attachment(value = "attachment", type = "text/json")
    public String attachment(String str) {
        return str;
    }

}
