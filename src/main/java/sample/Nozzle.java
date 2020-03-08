package sample;

import java.util.ArrayList;

class Nozzle {


    private ArrayList<Injector> injectors;

    
    public Nozzle(){
        this.injectors = new ArrayList<Injector>();
    }
    

    //Getters
    public ArrayList<Injector> getInjectors(){
        return this.injectors;
    }
}