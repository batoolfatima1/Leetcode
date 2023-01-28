package DesignPatternsInJava.CreationalDesignPattern.AbstractFactory;

public class TraineeAbstractFactory extends AbstractFactory
{

    @Override
    Profession getProfession(String nameOfProfession) {
        if(nameOfProfession.equalsIgnoreCase("doctor"))
        {
            return new TraineeDoctor();
        }
        else if (nameOfProfession.equalsIgnoreCase("engineer"))
        {
            return new TraineeEngineer();
        }
        else
            return null;
    }
    
}
