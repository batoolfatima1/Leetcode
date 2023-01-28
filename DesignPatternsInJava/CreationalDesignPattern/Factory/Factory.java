package DesignPatternsInJava.CreationalDesignPattern.Factory;

// creational design pattern
/* way to creating obj either with new keyword or auto or etc */

public class Factory {

    /* interface 
     * concrete classes implements that interface 
     * factory class which creates obj of desired concrete class 
     * from main instead of calling to concrete class we will cal factory class and tell him the name of class we want
     */

     // used when we don't want to show the creational logic to client   
     
     
     public Profession getProfession(String nameOfProfession)
     {
        if(nameOfProfession.equalsIgnoreCase("doctor"))
        {
            return new Doctor();
        }
        else if(nameOfProfession.equalsIgnoreCase("engineer"))
        {
            return new Engineer();
        }
        else
        {
            return null;
        }
     }
}

