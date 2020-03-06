package sample;


class BranchPressureDifferenceMeasurement{

    private float pressure;
    private float measurementsAverage;
    private float measurementsDeviation;
    private float measurementsDeviationPercentage;

    public BranchPressureDifferenceMeasurement(float pressureToSet, float measurementsAverageToSet){

        this.pressure = pressureToSet;
        this.measurementsAverage = measurementsAverageToSet;

        this.measurementsDeviation = this.calculateMeasurementsDeviation();
        this.measurementsDeviationPercentage = this.calculateMeasurementsDeviationPercentage();
    }

    private float calculateMeasurementsDeviation(){
        return Math.abs(this.measurementsAverage - this.pressure) / pressure;
    }

    private float calculateMeasurementsDeviationPercentage(){
        return this.measurementsDeviation * 100;
    }

    //Getters
    public float getPressure(){
        return this.pressure;
    }

    public float getMeasurementsAverage(){
        return this.measurementsAverage;
    }

    public float getMeasurementsDeviation(){
        return this.measurementsDeviation;
    }

    public float getMeasurementsDeviationPercentage(){
        return this.measurementsDeviationPercentage;
    }
}