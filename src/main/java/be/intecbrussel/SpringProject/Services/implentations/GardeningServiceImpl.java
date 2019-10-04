package be.intecbrussel.SpringProject.Services.implentations;

import be.intecbrussel.SpringProject.Services.interfaces.GardeningService;
import be.intecbrussel.SpringProject.tools.interfaces.GardeningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class GardeningServiceImpl implements GardeningService {
    private GardeningTool gardeningTool;

    @Override
    public void garden() {
        System.out.println("Working in the garden.");
        this.gardeningTool.doGardenJob();
    }

    public void init(){
        System.out.println("GardeningService preparing for work.");
    }

    public void destroy(){
        System.out.println("GardeningService Cleaning up.");
    }

    @Autowired
    public GardeningServiceImpl setGardeningTool(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
        return this;
    }
}
