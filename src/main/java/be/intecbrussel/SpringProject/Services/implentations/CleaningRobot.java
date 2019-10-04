package be.intecbrussel.SpringProject.Services.implentations;

import be.intecbrussel.SpringProject.Services.interfaces.CleaningService;
import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Lazy
@Qualifier("robot")
@Primary
public class CleaningRobot implements CleaningService {

    private List<CleaningTool> cleaningTools;

    @Autowired
    public void setCleaningTools(List<CleaningTool> cleaningTools) {
        this.cleaningTools = cleaningTools;
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the house");
        cleaningTools.forEach(CleaningTool::doCleanJob);
    }

    @Override
    @Value("8")
    public void rate(int rate) {
        System.out.println("your current rate is set on "+rate+" per hour.");
    }

    public void init(){
        System.out.println("CleaningRobot preparing for work.");
    }

    public void destroy(){
        System.out.println("CleaningRobot Cleaning up.");
    }

}
