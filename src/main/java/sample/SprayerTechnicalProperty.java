package sample;



class SprayerTechnicalProperty{

    private SPRAYER_TECHNICAL_PROPERTY_TYPE type;
    private String query;
    private String suggestion;
    private SPRAYER_TECHNICAL_PROPERTY_DEVIATION deviation;
    private SPRAYER_TECHNICAL_PROPERTY_ADEQUACY adequacy;


    public SprayerTechnicalProperty(SPRAYER_TECHNICAL_PROPERTY_TYPE typeToSet, String queryToSet, String suggestionToSet, 
                                    SPRAYER_TECHNICAL_PROPERTY_DEVIATION deviationToSet, SPRAYER_TECHNICAL_PROPERTY_ADEQUACY adequacyToSet){

                                        this.type = typeToSet;
                                        this.query = queryToSet;
                                        this.suggestion = suggestionToSet;
                                        this.deviation = deviationToSet;
                                        this.adequacy = adequacyToSet;

    }
}