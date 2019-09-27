package be.intecbrussel.SpringProject.tools.implentations;

import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;

public class DisposableDuster implements CleaningTool {
    private boolean used = false;

    public DisposableDuster(){
        System.out.println("this is the disposableDuster Constructor");
    }

    @Override
    public void doCleanJob() {
        if (used){
            System.out.println("I'm already used. Please throw me away.");
        }else{
            System.out.println("Wipe the dust away.");
            this.used=true;
        }
    }
}
