package DesignPatternsInJava.CreationalDesignPattern.AbstractFactory;

public class Doctor implements Profession{

    @Override
    public void print() {
        System.out.println("doctor");
    }
    
}
