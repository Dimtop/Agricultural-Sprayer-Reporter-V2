package sample;


class BeamSprayer extends Sprayer{

    

    public BeamSprayer(SPRAYER_CATEGORY categoryToSet, SPRAYER_SUBCATEGORY subcategoryToSet, 
                        String manufacturerToSet, String serialNumberToSet, int tankNumberToSet, 
                        int tankCapacityToSet, int nozzleNumberToSet){

        super(categoryToSet,subcategoryToSet,manufacturerToSet,serialNumberToSet,tankCapacityToSet,tankCapacityToSet,nozzleNumberToSet, 2);

    }
}