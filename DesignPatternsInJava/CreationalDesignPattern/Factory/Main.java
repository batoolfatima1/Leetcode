package DesignPatternsInJava.CreationalDesignPattern.Factory;

public class Main 
{
    public static void main(String[] args) {
        Factory factory = new Factory();
        Profession pro = factory.getProfession("Doctor") ;
        pro.print();
    }   
}
