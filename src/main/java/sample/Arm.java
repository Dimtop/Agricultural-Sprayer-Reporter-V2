package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Arm {

    private ArrayList<Branch> branches;
    private float armSize;

    public Arm(ArrayList<Branch> branchesToSet, float armSizeToSet){
        this.branches = branchesToSet;
        this.armSize = armSizeToSet;

    }
}