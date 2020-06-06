package com.kasibkismath.covidtracker.service;


import com.kasibkismath.covidtracker.dto.CovidDataWrapperDto;

public interface DashboardService {

    CovidDataWrapperDto getCovidData();
}
