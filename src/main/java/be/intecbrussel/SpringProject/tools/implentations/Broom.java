package be.intecbrussel.SpringProject.tools.implentations;

import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Order(1)
public class Broom implements CleaningTool {
    private int timesUsed;

    public Broom(){
        System.out.println("this is the broom Constructor");
    }

    public void doCleanJob() {
        System.out.println("swoosh swoosh swoosh. for the "+ ++timesUsed + " time.");
    }
}
