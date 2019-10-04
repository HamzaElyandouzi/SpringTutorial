package be.intecbrussel.SpringProject.tools.implentations;

import be.intecbrussel.SpringProject.tools.interfaces.GardeningTool;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LawnMower implements GardeningTool {

    public LawnMower(){
        System.out.println("this is the lawnMower constructor.");
    }

    @Override
    public void doGardenJob() {
        System.out.println("Mowing the lawn");
    }
}
