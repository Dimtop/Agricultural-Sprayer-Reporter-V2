package sample;

import java.util.ArrayList;

class SprayerTechnicalProperty {

    private String index;
    private SPRAYER_TECHNICAL_PROPERTY_TYPE type;
    private String query;
    private String suggestion;
    private SPRAYER_TECHNICAL_PROPERTY_DEVIATION deviation;
    private SPRAYER_TECHNICAL_PROPERTY_ADEQUACY adequacy;
    private ArrayList<String> notes;

    public SprayerTechnicalProperty(String indexToSet,SPRAYER_TECHNICAL_PROPERTY_TYPE typeToSet, String queryToSet, String suggestionToSet, 
                                    SPRAYER_TECHNICAL_PROPERTY_DEVIATION deviationToSet, SPRAYER_TECHNICAL_PROPERTY_ADEQUACY adequacyToSet, ArrayList<String> notesToSet){

                                        this.index = indexToSet;
                                        this.type = typeToSet;
                                        this.query = queryToSet;
                                        this.suggestion = suggestionToSet;
                                        this.deviation = deviationToSet;
                                        this.adequacy = adequacyToSet;
                                        this.notes = notesToSet;

    }
}