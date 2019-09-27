package be.intecbrussel.SpringProject.tools.implentations;

import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;

public class Broom implements CleaningTool {
    private int timesUsed;


    public Broom(){
        System.out.println("this is the broom Constructor");
    }

    public void doCleanJob() {
        System.out.println("swoosh swoosh swoosh. for the "+ ++timesUsed + " time.");
    }
}
