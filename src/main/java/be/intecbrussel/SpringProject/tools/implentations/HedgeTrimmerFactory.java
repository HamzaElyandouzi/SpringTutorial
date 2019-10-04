package be.intecbrussel.SpringProject.tools.implentations;

import be.intecbrussel.SpringProject.tools.interfaces.GardeningTool;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
@Component
public class HedgeTrimmerFactory {

    @Bean
    @Primary
    public GardeningTool hedgeTrimmer(){
        int hour = LocalTime.now().getHour();
        if (hour > 8 && hour < 18) {
            return () -> System.out.println("Trimming Electric");
        }else{
            return () -> System.out.println("Trimming Manual");
        }
    }
}
