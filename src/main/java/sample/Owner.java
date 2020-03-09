package sample;

import java.util.ArrayList;


class Owner {

    private String fullName;
    private String fatherName;
    private String VATNumber;
    private String phone;
    private String email;
    private ArrayList<Sprayer> sprayers;

    public Owner(String fullNameToSet, String fatherNameToSet, String VATNumberToSet, String phoneToSet, String emailToSet){
        
        this.fullName = fullNameToSet;
        this.fatherName = fatherNameToSet;
        this.VATNumber = VATNumberToSet;
        this.phone = phoneToSet;
        this.email = emailToSet;
        this.sprayers = new ArrayList<Sprayer>();
    }
}