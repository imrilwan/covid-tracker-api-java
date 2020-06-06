package com.kasibkismath.covidtracker.feign;

import com.kasibkismath.covidtracker.dto.CovidDataWrapperDto;
import org.springframework.stereotype.Component;

@Component
public class HealthPromotionBureauServiceFallback implements HealthPromotionBureauService {

    @Override
    public CovidDataWrapperDto getCovidData() {
        return null;
    }
}
