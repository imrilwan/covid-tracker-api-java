package com.kasibkismath.covidtracker.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HospitalData {
    private Long cumulative_local;
    private Long cumulative_foreign;
    private Long treatment_local;
    private Long treatment_foreign;
    private Long cumulative_total;
    private Long treatment_total;
    private HospitalDto hospital;
}
