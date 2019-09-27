package be.intecbrussel.SpringProject.Services.implentations;

import be.intecbrussel.SpringProject.Services.interfaces.CleaningService;
import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;

public class CleaningServiceImpl implements CleaningService {

    private CleaningTool cleaningTool;

    public CleaningServiceImpl() {
    }

    public CleaningServiceImpl(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
    }

    public CleaningServiceImpl setCleaningTool(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
        return this;
    }

    public void init(){
        System.out.println("CleaningService preparing for work.");
    }

    public void destroy(){
        System.out.println("CleaningService Cleaning up.");
    }

    public void clean() {
        System.out.println("cleaning the house");
        cleaningTool.doCleanJob();
    }
}
