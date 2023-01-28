package DesignPatternsInJava.CreationalDesignPattern.Builder;

public class Director
{
    private Builder b;

    Director(Builder typeOfBuilder) // specifying builder type we want
    {
        b= typeOfBuilder;
    }

     Home getHome()
     {
        return b.getDescriptions();
     }

     void manageRequiredConstruction()
     {
        b.setFloor();
        b.setLength();
     }
}
