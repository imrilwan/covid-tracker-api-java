package com.kasibkismath.covidtracker.feign;

import com.kasibkismath.covidtracker.dto.CovidDataWrapperDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "HEALTH-PROMOTION-BUREAU",
        url = "${covidtracker.feign.healthPromotionBureau.url}",
        path = "/api",
        fallback = HealthPromotionBureauServiceFallback.class)
public interface HealthPromotionBureauService {

    @GetMapping("/get-current-statistical")
    CovidDataWrapperDto getCovidData();
}
