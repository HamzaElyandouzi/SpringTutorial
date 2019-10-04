package be.intecbrussel.SpringProject.tools.implentations;

import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Scope("prototype")
@Order(4)
public class DisposableDuster implements CleaningTool {
    private boolean used = false;
    private Logger logger;

    public DisposableDuster(){
        System.out.println("this is the disposableDuster Constructor");
    }

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
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
