package sample;


class PressureIndicatorPrecisionMeasurement{

    private float calibrationPressure;
    private float measurement1;
    private float measurement2;
    private float measurement3;
    private float measurementsAverage;
    private float measurementsDeviation;
    private float measurementsDeviationPercentage;


    public PressureIndicatorPrecisionMeasurement(float calibrationPressureToSet, float measurement1ToSet, float measurement2ToSet, float measurement3ToSet){

        this.calibrationPressure = calibrationPressureToSet;
        this.measurement1 = measurement1ToSet;
        this.measurement2 = measurement2ToSet;
        this.measurement3 = measurement3ToSet;

        this.measurementsAverage = this.calculateMeasurementsAverage();
        this.measurementsDeviation = this.calculateMeasurementsDeviations();
        this.measurementsDeviationPercentage = this.measurementsDeviation * 100;
    }



    private float calculateMeasurementsAverage(){
        return ( this.measurement1 + this.measurement2 + this.measurement3 )  / 3;
    }

    private float calculateMeasurementsDeviations(){
        return Math.abs( (this.measurementsAverage-this.calibrationPressure) / this.calibrationPressure);
    }

    //Getters
    public float getCalibrationPressure(){
        return this.calibrationPressure;
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