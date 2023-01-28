package DesignPatternsInJava.CreationalDesignPattern.Singelton;

public class Singleton {
    
    private static Singleton obj = new Singleton();

    // private constructor
    private Singleton()
    {

    }

    public static Singleton getInstanceOfSingletonClass()
    {
        return obj;
    }

    public void print()
    {
        System.out.println("hascode for this obj is "+ obj);
    }
}
