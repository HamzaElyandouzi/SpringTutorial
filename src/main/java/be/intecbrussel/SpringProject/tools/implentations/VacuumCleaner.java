package be.intecbrussel.SpringProject.tools.implentations;

import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Order(2)
public class VacuumCleaner implements CleaningTool {

    public VacuumCleaner(){
        System.out.println("this is the vacuumCleaner Constructor");
    }

    public void doCleanJob() {
        System.out.println("zuuuuuuu");
    }
}
