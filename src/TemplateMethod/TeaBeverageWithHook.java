package TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaBeverageWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void brew() {
        System.out.println("Stepping the tea");
    }

    @Override
    protected void addContiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected boolean customerWantsCondiments() {
        if (getUserInput().toLowerCase().startsWith("y"))
            return true;
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;

        System.out.println("Would you like lemon with your tea? (y/n)");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        }catch (IOException ioe){
            System.err.println("IO error trying to read your answer");
        }

        return answer;
    }
}
