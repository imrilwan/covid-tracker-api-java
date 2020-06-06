package com.kasibkismath.covidtracker.service.impl;

import com.kasibkismath.covidtracker.dto.CovidDataWrapperDto;
import com.kasibkismath.covidtracker.feign.HealthPromotionBureauService;
import com.kasibkismath.covidtracker.service.DashboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private HealthPromotionBureauService healthPromotionBureauService;

    @Override
    public CovidDataWrapperDto getCovidData() {
        CovidDataWrapperDto data = healthPromotionBureauService.getCovidData();
        if(!Objects.isNull(data)) {
            return data;
        } else {
            log.info("Null data returned from Health Promotion Bureau -> getCovid19Data");
            return new CovidDataWrapperDto();
        }

    }
}
