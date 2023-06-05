package com.grove.grn_webapp.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@AllArgsConstructor
public class EventDTO {
    private String title;
    private AddressDTO address;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private int capacity;
    private int entryPrice;
    private String description;
}
