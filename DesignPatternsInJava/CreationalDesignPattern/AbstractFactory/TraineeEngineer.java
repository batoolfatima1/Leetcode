package DesignPatternsInJava.CreationalDesignPattern.AbstractFactory;

public class TraineeEngineer implements Profession{
    @Override
    public void print() {
        System.out.println("trainee engineer");
    }
}
