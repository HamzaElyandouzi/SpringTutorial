package be.intecbrussel.SpringProject.App;

import be.intecbrussel.SpringProject.Services.implentations.CleaningServiceImpl;
import be.intecbrussel.SpringProject.Services.interfaces.CleaningService;
import be.intecbrussel.SpringProject.Services.interfaces.DomesticService;
import be.intecbrussel.SpringProject.Services.interfaces.GardeningService;
import be.intecbrussel.SpringProject.tools.implentations.DisposableDusterProxy;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {
    public static void main(String[] args) {

        CleaningServiceImpl cleaners= new CleaningServiceImpl();
        DisposableDusterProxy dusterProxy = new DisposableDusterProxy();
        cleaners.setCleaningTool(dusterProxy);
        cleaners.clean();
        cleaners.clean();
        cleaners.clean();
        cleaners.clean();
        cleaners.clean();

        try(ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(be.intecbrussel.SpringProject.App.HouseContextConfig.class);){

            CleaningService jill = context.getBean("service1", CleaningService.class);
            CleaningService bob = context.getBean("service1", CleaningService.class);
            CleaningService john = context.getBean("john", CleaningService.class);
            CleaningService scott = context.getBean("Scott", CleaningService.class);
            context.getBean("scotty", GardeningService.class).garden();
            System.out.println("");

            jill.clean();
            bob.clean();
            john.clean();
            scott.clean();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
