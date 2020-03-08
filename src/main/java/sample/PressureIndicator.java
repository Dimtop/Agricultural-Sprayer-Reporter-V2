package sample;

import java.util.ArrayList;

class PressureIndicator {

    private float diameter;
    private ArrayList<PressureIndicatorPrecisionMeasurement> measurements;

    public PressureIndicator(){
        this.measurements = new ArrayList<PressureIndicatorPrecisionMeasurement>();
    }

    public void loadDefaultMeasurements(){
        this.diameter = 63;
        this.measurements.add(new PressureIndicatorPrecisionMeasurement(8, 5, 5, 5));
        this.measurements.add(new PressureIndicatorPrecisionMeasurement(12, 10, 10, 10));
        this.measurements.add(new PressureIndicatorPrecisionMeasurement(17, 15, 15, 15));
    }

    public void printMeasurements(){
        for(PressureIndicatorPrecisionMeasurement measurement : this.measurements){
            System.out.println("CALIBRATION PRESSURE: " + measurement.getCalibrationPressure() 
                                + "     M1: " + measurement.getMeasurement1() 
                                + "     M2: " + measurement.getMeasurement2()
                                + "     M3: " + measurement.getMeasurement3()
                                + "     AVERAGE: " + measurement.getMeasurementsAverage()
                                + "     DEVIATION: " +measurement.getMeasurementsDeviation()
                                + "     DEVIATION PERCENTAGE: " +measurement.getMeasurementsDeviationPercentage());
        }
    }

}