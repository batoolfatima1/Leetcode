package DesignPatternsInJava.CreationalDesignPattern.Builder;

public class EarthQuakeBuilder implements Builder {
 
    
    private Home h = new Home();
    @Override
    public void setLength() {
        
        h.length = "50";
    }

    @Override
    public void setFloor() {
        
        h.height = "even";
        
    }

    @Override
    public Home getDescriptions() {
        
        return h;
    }
}
