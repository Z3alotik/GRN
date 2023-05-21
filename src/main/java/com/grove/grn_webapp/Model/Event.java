package com.grove.grn_webapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "events")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Event {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String address;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private int capacity;
    private int entryPrice;
    private String description;

    public Event(String title, String address, LocalDate startDate, LocalDate endDate, LocalTime startTime,
                 LocalTime endTime, int capacity, int entryPrice, String description) {
        this.title = title;
        this.address = address;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.capacity = capacity;
        this.entryPrice = entryPrice;
        this.description = description;
    }
}
