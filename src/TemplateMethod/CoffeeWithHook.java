package TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void brew() {

    }

    @Override
    protected void addContiments() {
        System.out.println("Adding sugar and milk");
    }

    // Here we override the hook method and
    // provide it's own functionality
    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee? (y/n)");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        }catch (IOException ioe){
            System.err.println("IO error trying to read your answer");
        }

        return answer;
    }
}
