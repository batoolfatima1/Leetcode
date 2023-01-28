package DesignPatternsInJava.CreationalDesignPattern.Factory;

public class Doctor implements Profession {

    @Override
    public void print() {
        System.out.println("doctor is created");    
    }
    
}
