package sample;
import java.lang.reflect.Array;
import java.util.ArrayList;

class BranchPositioningMeasurement{

    private float maxBranchDistance;
    private ArrayList<Float> pointDistanceMeasurements;
    private ArrayList<Float> differencesBetweenPoints; 
    private ArrayList<Float> differenceBetweenPoinDifferenciesAndMaxBranchDistance;

    public BranchPositioningMeasurement(float armSize,ArrayList<Float> pointDistanceMeasurementsToSet){
        
        if(armSize<20){
            this.maxBranchDistance = 10;
        }
        else{
            this.maxBranchDistance = (float) Math.floor(armSize / 2);
        }
        this.pointDistanceMeasurements = pointDistanceMeasurementsToSet;
        this.differencesBetweenPoints = this.calculateDifferencesBetweenPoints();
        this.differenceBetweenPoinDifferenciesAndMaxBranchDistance = this.calculateDifferenceBetweenPoinDifferenciesAndMaxBranchDistance();
    }

    private ArrayList<Float> calculateDifferencesBetweenPoints(){

        ArrayList<Float> differencesBetweenPointsToReturn = new ArrayList<Float>();

        for(int i=0;i<this.pointDistanceMeasurements.size();i++){
            for(int j=i+1;j<this.pointDistanceMeasurements.size();j++){
                differencesBetweenPointsToReturn.add(Math.abs(this.pointDistanceMeasurements.get(i)-this.pointDistanceMeasurements.get(j)));
            }
        }

        return differencesBetweenPointsToReturn;
    }

    private ArrayList<Float> calculateDifferenceBetweenPoinDifferenciesAndMaxBranchDistance(){

        ArrayList<Float> differenceBetweenPoinDifferenciesAndMaxBranchDistanceToReturn = new ArrayList<Float>();

        for(int i=0;i<this.differencesBetweenPoints.size();i++){
            differenceBetweenPoinDifferenciesAndMaxBranchDistanceToReturn.add(this.maxBranchDistance - this.differencesBetweenPoints.get(i));
        }   

        return differenceBetweenPoinDifferenciesAndMaxBranchDistanceToReturn;
    }


    //Getters
    public ArrayList<Float> getPointDistanceMeasurements(){
        return this.pointDistanceMeasurements;
    }

    public ArrayList<Float> getDifferencesBetweenPoints(){
        return this.differencesBetweenPoints;
    }

    public ArrayList<Float> getDifferenceBetweenPointDiefferenciesAndMaxBranchDistance(){
        return this.differenceBetweenPoinDifferenciesAndMaxBranchDistance;
    }
    
}


