package DesignPatternsInJava.CreationalDesignPattern.AbstractFactory;

public  class AbstractFactoryProducer
{

    public static AbstractFactory getProfession(boolean b)
    {
        if(b) // true means wants trainee
        {
            return new TraineeAbstractFactory();
        }
        else
        {
            return new SimpleAbstractFactory();
        }
    }
    
}
