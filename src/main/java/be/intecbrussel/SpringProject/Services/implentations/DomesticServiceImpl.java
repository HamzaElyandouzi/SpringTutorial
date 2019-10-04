package be.intecbrussel.SpringProject.Services.implentations;

import be.intecbrussel.SpringProject.Services.interfaces.CleaningService;
import be.intecbrussel.SpringProject.Services.interfaces.DomesticService;
import be.intecbrussel.SpringProject.Services.interfaces.GardeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("domesticService")
public class DomesticServiceImpl implements DomesticService {

    private GardeningService gardeningService;
    private CleaningService cleaningService;
    private Logger logger;

    public DomesticServiceImpl() {
        System.out.println("organising the household");
    }

    @Override
    public void init() {
        System.out.println("preparing to clean the entire house.");
    }

    @Override
    public void destroy() {
        System.out.println("Finished cleaning the house. Preparing to go home.");
    }

    @Autowired
    public DomesticServiceImpl setGardeningService(GardeningService gardeningService) {
        this.gardeningService = gardeningService;
        return this;
    }

    @Autowired
    @Qualifier("robot")
    public DomesticServiceImpl setCleaningService(CleaningService cleaningService) {
        this.cleaningService = cleaningService;
        return this;
    }

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void runHouseHold() {
        logger.info("Running household");
        this.cleaningService.clean();
        this.gardeningService.garden();
    }
}
