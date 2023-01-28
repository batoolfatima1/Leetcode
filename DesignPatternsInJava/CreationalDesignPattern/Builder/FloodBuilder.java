package DesignPatternsInJava.CreationalDesignPattern.Builder;

public class FloodBuilder implements Builder {

    private Home h = new Home();
    @Override
    public void setLength() {
        
        h.length = "10";
    }

    @Override
    public void setFloor() {
        
        h.height = "level";
        
    }

    @Override
    public Home getDescriptions() {
        
        return h;
    }
    
}
