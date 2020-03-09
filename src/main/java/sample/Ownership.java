package sample;



class Ownership{

    Owner owner;
    float ownershipPercentage;

    public Ownership(Owner ownerToSet, float ownershipPercentageToSet){
        this.owner = ownerToSet;
        this.ownershipPercentage = ownershipPercentageToSet;
    }
}