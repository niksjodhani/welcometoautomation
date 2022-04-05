package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> value = new ArrayList<>();
        value.add("Scrum");
        value.add("Java");
        value.add("Jira");
        value.add("Selenium");
        value.add("Cucumber");
        value.add("Postman");
        value.add("Rest Assured");

        for (String e : value) {
            System.out.println(e);

        }

    }
}
