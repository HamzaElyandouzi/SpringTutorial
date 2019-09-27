package be.intecbrussel.SpringProject.App;

import be.intecbrussel.SpringProject.Services.interfaces.DomesticService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InOutHouseApp {
    public static void main(String[] args) {

        try(ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(HouseContextConfig.class)){
            DomesticService domesticService = context.getBean("domesticCleaners", DomesticService.class);

            System.out.println("");
            domesticService.runHouseHold();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
