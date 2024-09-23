package com.mycompany.app;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

    }

    public String myFirstProgram(){
        System.out.println("My First Program");
        return("My First Program");
    }

    public String myLearningProgress(){
        return("Learning Progress is Good");
    }

    public int addTwoNumbers(int a ,int b){
         return(a+b);
    }

    public float divTwoNumbers(float a, float b){

        return(a/b);
    }

    public int greatestOfTwo(int a , int b){
 
         if(a>b){
            return a;
         }
         else{
            return b;
         }
    }

    public double mulTwoNumbers(float a, float b){
        return(a*b);
    }

}
