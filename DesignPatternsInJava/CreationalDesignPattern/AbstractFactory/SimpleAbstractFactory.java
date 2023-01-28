package DesignPatternsInJava.CreationalDesignPattern.AbstractFactory;

public class SimpleAbstractFactory extends AbstractFactory
{

    @Override
    Profession getProfession(String nameOfProfession) {
        if(nameOfProfession.equalsIgnoreCase("doctor"))
        {
            return new Doctor();
        }
        else if (nameOfProfession.equalsIgnoreCase("engineer"))
        {
            return new Engineer();
        }
        else
            return null;
    }
    
}
