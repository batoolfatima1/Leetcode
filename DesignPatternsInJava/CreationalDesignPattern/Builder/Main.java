package DesignPatternsInJava.CreationalDesignPattern.Builder;

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
