package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Branch {

    private ArrayList<BranchSustenanceMeasurement> branchSustenanceMeasurements;
    private ArrayList<BranchPressureDifferenceMeasurement> branchPressureDifferenceMeasurements;
    private ArrayList<NozzlePositioningMeasurement> nozzlePositioningMeasurements;
    private BranchPositioningMeasurement branchPositioningMeasurement;
    private ArrayList<Nozzle> nozzles;
    private float nozzlesInjectorsCollectiveDeviationFactor;

    public Branch(){

        this.branchSustenanceMeasurements = new ArrayList<BranchSustenanceMeasurement>();
        this.branchPressureDifferenceMeasurements = new  ArrayList<BranchPressureDifferenceMeasurement>();
        this.nozzlePositioningMeasurements = new ArrayList<NozzlePositioningMeasurement>();
        this.nozzles = new ArrayList<Nozzle>();
    }

    public float calculateNozzlesInjectorsCollectiveDeviationFactor(int injectorIndex){

        int injectorsNumber =0;
        float injectorsRealSupplySum=0;

        if(this.nozzles.size() == 0){
            return 1;
        }
        else{
            for(Nozzle nozzle : this.nozzles){
                injectorsRealSupplySum+=nozzle.getInjectors().get(injectorIndex).getRealSupply();
                injectorsNumber++;
                
            }
            System.out.println(injectorsRealSupplySum);
            return injectorsRealSupplySum / injectorsNumber;
        }
    }

    public void loadDefaultBranchSustenanceMeasurements(){
        this.branchSustenanceMeasurements.add(new BranchSustenanceMeasurement(18,20,20,20));
    }

    public void loadDefaultBranchPressureDifferenceMeasurements(){
        this.branchPressureDifferenceMeasurements.add(new BranchPressureDifferenceMeasurement(15,15));
        this.branchPressureDifferenceMeasurements.add(new BranchPressureDifferenceMeasurement(20,20));
        this.branchPressureDifferenceMeasurements.add(new BranchPressureDifferenceMeasurement(25,25));
    }

    public void loadDefaultBranchPositioningMeasurement(){
        ArrayList<Float> measurements = new ArrayList<Float>();
        measurements.add(new Float(10.0f));
        measurements.add(new Float(10.0f));
        measurements.add(new Float(10.0f));
        measurements.add(new Float(10.0f));
        measurements.add(new Float(10.0f));

       this.branchPositioningMeasurement = new BranchPositioningMeasurement(10, measurements);
    }


   public void printMeasurements(){
       
        System.out.println("\n\nPOINTS");
        for(Float measurement: this.branchPositioningMeasurement.getPointDistanceMeasurements()){
            System.out.println(measurement.toString());
        }

        System.out.println("\n\nDIFFS");
        for(Float diff : this.branchPositioningMeasurement.getDifferencesBetweenPoints()){
            System.out.println(diff.toString());
        }

        System.out.println("\n\nMAX DIFFS");
        for(Float maxDiff: this.branchPositioningMeasurement.getDifferenceBetweenPointDiefferenciesAndMaxBranchDistance()){
            System.out.println(maxDiff.toString());
        }
   }


    //Getters
    public ArrayList<Nozzle> getNozzles(){
        return this.nozzles;
    }
}