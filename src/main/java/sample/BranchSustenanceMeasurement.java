package sample;


class BranchSustenanceMeasurement{

    private float pressure;
    private float measurement1;
    private float measurement2;
    private float measurement3;
    private float measurement1Deviation;
    private float measurement2Deviation;
    private float measurement3Deviation;
    private float measurement1DeviationPercentage;
    private float measurement2DeviationPercentage;
    private float measurement3DeviationPercentage;

    public BranchSustenanceMeasurement(float pressureToSet, float measurement1ToSet, float measurement2ToSet, float measurement3ToSet){

        this.pressure = pressureToSet;
        this.measurement1 = measurement1ToSet;
        this.measurement2 = measurement2ToSet;
        this.measurement3 = measurement3ToSet;

        this.calculateMeasurementsDeviations();
        this.calculateMeasurementsDeviationsPercentages();
    }

    private void calculateMeasurementsDeviations(){
        this.measurement1Deviation = Math.abs(this.measurement1 - this.pressure) / this.pressure;;
        this.measurement2Deviation = Math.abs(this.measurement2 - this.pressure) / this.pressure;;
        this.measurement3Deviation = Math.abs(this.measurement3 - this.pressure) / this.pressure;;
    }

    private void calculateMeasurementsDeviationsPercentages(){
        this.measurement1DeviationPercentage = this.measurement1Deviation * 100;
        this.measurement2DeviationPercentage = this.measurement2Deviation * 100;
        this.measurement3DeviationPercentage = this.measurement3Deviation * 100;
    }


    //Getters
    public float getPressure(){
        return this.pressure;
    }
    
    public float getMeasurement1(){
        return this.measurement1;
    }

    public float getMeasurement2(){
        return this.measurement2;
    }

    public float getMeasurement3(){
        return this.measurement3;
    }

    public float getMeasurement1Deviation(){
        return this.measurement1Deviation;
    }

    public float getMeasurement2Deviation(){
        return this.measurement2Deviation;
    }

    public float getMeasurement3Deviation(){
        return this.measurement3Deviation;
    }

    public float getMeasurement1DeviationPercentage(){
        return this.measurement1DeviationPercentage;
    }

    public float getMeasurement2DeviationPercentage(){
        return this.measurement2DeviationPercentage;
    }

    public float getMeasurement3DeviationPercentage(){
        return this.measurement3DeviationPercentage;
    }
}