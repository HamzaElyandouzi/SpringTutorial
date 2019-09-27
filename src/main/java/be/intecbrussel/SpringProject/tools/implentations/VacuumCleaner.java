package be.intecbrussel.SpringProject.tools.implentations;

import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;

public class VacuumCleaner implements CleaningTool {

    public VacuumCleaner(){
        System.out.println("this is the vacuumCleaner Constructor");
    }

    public void doCleanJob() {
        System.out.println("zuuuuuuu");
    }
}
