package be.intecbrussel.SpringProject.App;

import be.intecbrussel.SpringProject.Services.implentations.*;
import be.intecbrussel.SpringProject.Services.interfaces.*;
import be.intecbrussel.SpringProject.tools.interfaces.*;
import be.intecbrussel.SpringProject.tools.implentations.*;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("be.intecbrussel.SpringProject")
public class HouseContextConfig {

    @Bean(name = "goodBroom")
    @Scope("prototype")
//    @Scope(value = "prototype",proxyMode = ScopedProxyMode.INTERFACES)
    public CleaningTool broom(){
        return new Broom();
    }

    @Bean(name = "slechteBezem")
    @Scope("prototype")
    public CleaningTool badBroom(){
        return new Broom();
    }

    @Bean(name = "vacuumy")
    @Scope("prototype")
    public CleaningTool vacuum(){
        return new VacuumCleaner();
    }

    @Bean(name = "spongy")
    @Scope("prototype")
    public CleaningTool sponge(){
        return new Sponge();
    }

    @Bean(name = "wegWerpDoekjes")
    @Scope("prototype")
    public CleaningTool disposableDuster(){
        return new DisposableDuster();
    }

    @Bean(name = {"service1", "Jill cleaning service"})
    @Description("This is a description of a cleaning service.")
    public CleaningService jill(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(broom());
        return cs;
    }

    @Bean
    public CleaningService bob(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(vacuum());
        return cs;
    }

    @Bean
    public CleaningService john(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(sponge());
        return cs;
    }

    @Bean(name = "Scott")
    public CleaningService scott(){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(disposableDuster());
        return cs;
    }

    @Bean
    @Scope("prototype")
    @Primary
    public CleaningTool cleaningTool(){
        return new DisposableDuster();
    }

    @Bean
    @Scope("prototype")
    public GardeningTool gardeningTool(){
        return new LawnMower();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public CleaningService cleaningService(CleaningTool cleaningTool){
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(cleaningTool);
        return cs;
    }


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public GardeningService gardeningService(GardeningTool gardeningTool){
        GardeningServiceImpl cs = new GardeningServiceImpl();
        cs.setGardeningTool(gardeningTool);
        return cs;
    }

    @Bean
    public DomesticService domesticCleaners(CleaningService cleaningService, GardeningService gardeningService){
        DomesticServiceImpl cs = new DomesticServiceImpl();
        cs.setCleaningService(cleaningService);
        cs.setGardeningService(gardeningService);
        return cs;
    }


}
