package sample;


class NozzlePositioningMeasurement{

    private float referenceDistance;
    private float realDistance;
    private NOZZLE_ORIENTATION orientaton;
    private NOZZLE_POSITION_TRANSFORMATION positionTransformation;

    public NozzlePositioningMeasurement(float referenceDistanceToSet, float realDistanceToSet){
        this.referenceDistance = referenceDistanceToSet;
        this.realDistance = realDistanceToSet;
        this.orientaton = NOZZLE_ORIENTATION.APPROPRIATE;
        this.setNozzlePositionTransformation();
    }


    private void setNozzlePositionTransformation(){
        if(this.referenceDistance != this.realDistance){
            this.positionTransformation = NOZZLE_POSITION_TRANSFORMATION.EXISTING;
        }
        else{
            this.positionTransformation = NOZZLE_POSITION_TRANSFORMATION.NONE;
        }
    }
}