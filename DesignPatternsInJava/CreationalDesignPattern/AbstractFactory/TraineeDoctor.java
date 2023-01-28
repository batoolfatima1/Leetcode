package DesignPatternsInJava.CreationalDesignPattern.AbstractFactory;

public class TraineeDoctor implements Profession {
    @Override
    public void print() {
        System.out.println("trainee doctor");
    }
}
