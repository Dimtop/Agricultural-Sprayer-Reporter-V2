package sample;

import java.util.ArrayList;


class Owner {

    private String fullName;
    private String fatherName;
    private String VATNumber;
    private String phone;
    private String email;
    private int ownershipPercentage;
    private ArrayList<Sprayer> sprayers;

    public Owner(String fullNameToSet, String fatherNameToSet, String VATNumberToSet, String phoneToSet, String emailToSet, int ownershipPercentageToSet){
        
        this.fullName = fullNameToSet;
        this.fatherName = fatherNameToSet;
        this.VATNumber = VATNumberToSet;
        this.phone = phoneToSet;
        this.email = emailToSet;
        this.ownershipPercentage = ownershipPercentageToSet;
        this.sprayers = new ArrayList<Sprayer>();
    }
}