package be.intecbrussel.SpringProject.tools.implentations;

import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;
import org.springframework.stereotype.Component;

@Component("sponge")
public class Sponge implements CleaningTool {
    public Sponge(){
        System.out.println("this is the sponge Constructor");
    }

    @Override
    public void doCleanJob() {
        System.out.println("Squiche and soapy");
    }
}
