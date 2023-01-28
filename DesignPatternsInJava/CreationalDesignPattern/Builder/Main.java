package DesignPatternsInJava.CreationalDesignPattern.Builder;

// used to build complex products
// where product could be of many types 
// so we tell our type to director ans he manages all the things for us
public class Main {
    public static void main(String[] args) {
        // specifying type we want
        EarthQuakeBuilder eb = new EarthQuakeBuilder();
        // telling that type to director
        Director d = new Director(eb);
        // perform construction
        d.manageRequiredConstruction();
        // getting home
       System.out.println(d.getHome().height); // make toString method of it in home
    }
}
