package be.intecbrussel.SpringProject.tools.implentations;

import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;

public class DisposableDusterProxy implements CleaningTool {
    private boolean used = false;

    public DisposableDusterProxy() {
        System.out.println("this is the disposableDusterProxy Constructor");
    }

    @Override
    public void doCleanJob() {
        new DisposableDuster().doCleanJob();
    }
}
