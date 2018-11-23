package tests;

import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class World {

    private String foo;
    private int j;
    public void setNumber(int i) {
        j = j + i;
        System.out.println("==========");
        System.out.println("j = " + j);
        System.out.println("==========");
    }
}
