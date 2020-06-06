package com.kasibkismath.covidtracker.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CovidDataWrapperDto {
    private boolean success;
    private String message;
    private CovidDataDto data;
    private String error;
}
