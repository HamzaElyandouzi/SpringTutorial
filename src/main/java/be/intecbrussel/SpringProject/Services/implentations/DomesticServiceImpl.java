package be.intecbrussel.SpringProject.Services.implentations;

import be.intecbrussel.SpringProject.Services.interfaces.CleaningService;
import be.intecbrussel.SpringProject.Services.interfaces.DomesticService;
import be.intecbrussel.SpringProject.Services.interfaces.GardeningService;

public class DomesticServiceImpl implements DomesticService {
    private GardeningService gardeningService;
    private CleaningService cleaningService;

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

    public DomesticServiceImpl setGardeningService(GardeningService gardeningService) {
        this.gardeningService = gardeningService;
        return this;
    }

    public DomesticServiceImpl setCleaningService(CleaningService cleaningService) {
        this.cleaningService = cleaningService;
        return this;
    }

    @Override
    public void runHouseHold() {
        this.cleaningService.clean();
        this.gardeningService.garden();
    }
}
