package DesignPatternsInJava.CreationalDesignPattern.Singelton;
// only one object of a class is created as each time new object is crested same hashcode is returning
// private constructor means can't directly construct object of this class
public class Main 
{
    public static void main(String[] args) {
        
    Singleton obj = Singleton.getInstanceOfSingletonClass();
    obj.print();

    // each time same hashcde is returning
    Singleton obj1 = Singleton.getInstanceOfSingletonClass();
    obj1.print();
    }

}
