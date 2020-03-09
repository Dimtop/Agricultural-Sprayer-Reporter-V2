package sample;

import java.util.ArrayList;

abstract class Sprayer {

    protected SPRAYER_CATEGORY category;
    protected SPRAYER_SUBCATEGORY subcategory;

    protected String manufacturer;
    protected String serialNumber;
    protected ArrayList<Ownership> ownerships;

    protected ArrayList<Arm> arms;

    protected int tankNumber;
    protected int tankCapacity;

    protected SprayerTechnicalReport technicalReport;

 

    protected PressureIndicator pressureIndicator;

    public Sprayer(SPRAYER_CATEGORY categoryToSet, SPRAYER_SUBCATEGORY subcategoryToSet, 
                    String manufacturerToSet, String serialNumberToSet, int tankNumberToSet, 
                    int tankCapacityToSet, SprayerTechnicalReport technicalReportToSet){

                    this.category = categoryToSet;
                    this.subcategory = subcategoryToSet;
                    this.manufacturer = manufacturerToSet;
                    this.serialNumber = serialNumberToSet;
                    this.tankNumber = tankNumberToSet;
                    this.tankCapacity = tankCapacityToSet;
                    this.technicalReport = technicalReportToSet;

                    this.pressureIndicator = new PressureIndicator();
    }



}