package sample;


class Injector{

    private float referenceSupply;
    private float measurementsAverage;
    private float waterCollectionDuration;

    private float realSupply;
    private float individualDeviation;
    private float collectiveDeviation;
    private float collectiveDeviationFactor;

    public Injector(float referenceSupplyToSet, float measurementsAverageToSet, float waterCollectionDurationToSet){//, float collectiveDeviationFactorToSet){
        this.referenceSupply = referenceSupplyToSet;
        this.measurementsAverage = measurementsAverageToSet;
        this.waterCollectionDuration = waterCollectionDurationToSet;

        this.realSupply = this.calculateRealSupply();
        this.individualDeviation = this.calculateIndividualDeviation();
        
    }


    private float calculateRealSupply(){
        float factor = 60 / this.waterCollectionDuration;
        return this.measurementsAverage / factor;
    }

    private float calculateIndividualDeviation(){
        return -1 * (1-(this.realSupply/this.referenceSupply));
    }

    public float calculateCollectiveDeviation(){
        return -1 * (1-(this.realSupply/this.collectiveDeviationFactor));
    }

    //Getters
    public float getRealSupply(){
        return this.realSupply;
    }

    public float getReferenceSupply(){
        return this.referenceSupply;
    }

    public float getIndividualDeviation(){
        return this.individualDeviation;
    }

    public float getCollectiveDeviation(){
        return this.collectiveDeviation;
    }

    public float getCollectiveDeviationFactor(){
        return this.collectiveDeviationFactor;
    }

    //Setters
    public void setCollectiveDeviationFactor(float collectiveDeviationFactorToSet){
        this.collectiveDeviationFactor = collectiveDeviationFactorToSet;
    }

}