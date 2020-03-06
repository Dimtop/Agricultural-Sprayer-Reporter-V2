package sample;

import java.util.ArrayList;

abstract class Sprayer {

    protected SPRAYER_CATEGORY category;
    protected SPRAYER_SUBCATEGORY subcategory;
    protected String manufacturer;
    protected String serialNumber;
    protected int tankNumber;
    protected int tankCapacity;
    protected int nozzleNumber;
    protected int branchNumber;
    protected ArrayList<Owner> owners;

    protected PressureIndicator pressureIndicator;

    public Sprayer(SPRAYER_CATEGORY categoryToSet, SPRAYER_SUBCATEGORY subcategoryToSet, 
                    String manufacturerToSet, String serialNumberToSet, int tankNumberToSet, 
                    int tankCapacityToSet, int nozzleNumberToSet, int branchNumberToSet){

        
                    this.category = categoryToSet;
                    this.subcategory = subcategoryToSet;
                    this.manufacturer = manufacturerToSet;
                    this.serialNumber = serialNumberToSet;
                    this.tankNumber = tankNumberToSet;
                    this.tankCapacity = tankCapacityToSet;
                    this.nozzleNumber = nozzleNumberToSet;
                    this.branchNumber = branchNumberToSet;

                    this.pressureIndicator = new PressureIndicator();
    }



}