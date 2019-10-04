package be.intecbrussel.SpringProject.App;

import be.intecbrussel.SpringProject.Services.implentations.CleaningRobot;
import be.intecbrussel.SpringProject.Services.implentations.CleaningServiceImpl;
import be.intecbrussel.SpringProject.Services.implentations.DomesticServiceImpl;
import be.intecbrussel.SpringProject.Services.interfaces.CleaningService;
import be.intecbrussel.SpringProject.Services.interfaces.DomesticService;
import be.intecbrussel.SpringProject.tools.interfaces.CleaningTool;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InOutHouseApp {
    public static void main(String[] args) {

        try(ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(HouseContextConfig.class)){
            DomesticService domesticService = context.getBean("domesticService",DomesticServiceImpl.class);

            System.out.println("");
            domesticService.runHouseHold();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
