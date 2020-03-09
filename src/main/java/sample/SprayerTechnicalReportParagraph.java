package sample;

import java.util.ArrayList;

class SprayerTechnicalReportParagraph {

    private String index;
    private String title;
    private ArrayList<SprayerTechnicalProperty> technicalProperties;

    public SprayerTechnicalReportParagraph(String indexToSet, String titleToSet, ArrayList<SprayerTechnicalProperty> technicalPropertiesToSet){
        this.index = indexToSet;
        this.title = titleToSet;
        this.technicalProperties = technicalPropertiesToSet;

    }
}