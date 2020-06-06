package com.kasibkismath.covidtracker.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CovidDataDto {
    private String update_date_time;
    private Long local_new_cases;
    private Long local_total_cases;
    private Long local_total_number_of_individuals_in_hospitals;
    private Long local_deaths;
    private Long local_new_deaths;
    private Long local_recovered;
    private Long local_active_cases;
    private List<PcrTestingDataDto> daily_pcr_testing_data;
    private List<HospitalData> hospital_data;
}
