package be.intecbrussel.SpringProject.Services.implentations;

import be.intecbrussel.SpringProject.Services.interfaces.CleaningService;
import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Lazy
public class CleaningServiceImpl implements CleaningService {

    private CleaningTool cleaningTool;

    public CleaningServiceImpl() {
    }

    public CleaningServiceImpl(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
    }

    @Autowired
    public CleaningServiceImpl setCleaningTool(@Qualifier("broom") CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
        return this;
    }

    @Override
    @Value("9")
    public void rate(int rate) {
        System.out.println("your current rate is set on "+rate+" per hour.");
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
