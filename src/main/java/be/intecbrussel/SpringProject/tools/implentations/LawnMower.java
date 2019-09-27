package be.intecbrussel.SpringProject.tools.implentations;

import be.intecbrussel.SpringProject.Services.implentations.GardeningServiceImpl;
import be.intecbrussel.SpringProject.tools.interfaces.GardeningTool;

public class LawnMower implements GardeningTool {

    public LawnMower(){
        System.out.println("a lawnMower is being created");
    }

    @Override
    public void doGardenJob() {
        System.out.println("Mowing the lawn");
    }
}
