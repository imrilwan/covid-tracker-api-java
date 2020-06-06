package com.kasibkismath.covidtracker.controller;

import com.kasibkismath.covidtracker.dto.CovidDataWrapperDto;
import com.kasibkismath.covidtracker.service.DashboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
@Slf4j
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/get-covid-data")
    public ResponseEntity<CovidDataWrapperDto> getCovid19Data() {
        try {
            return new ResponseEntity<>(dashboardService.getCovidData(), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            CovidDataWrapperDto covidDataWrapperDto = new CovidDataWrapperDto();
            covidDataWrapperDto.setSuccess(false);
            covidDataWrapperDto.setMessage("Error");
            covidDataWrapperDto.setError(e.getLocalizedMessage());

            log.error("Exception has occurred in getCovidData : " + e.getLocalizedMessage());
            return new ResponseEntity<>(covidDataWrapperDto, new HttpHeaders(), HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }
}
