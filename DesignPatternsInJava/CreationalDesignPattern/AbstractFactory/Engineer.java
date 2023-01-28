package DesignPatternsInJava.CreationalDesignPattern.AbstractFactory;

public class Engineer implements Profession{
    @Override
    public void print() {
        System.out.println("engineer");
    }
}
