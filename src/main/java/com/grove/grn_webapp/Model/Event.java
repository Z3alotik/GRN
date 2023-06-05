package com.grove.grn_webapp.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "events")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @Embedded
    private Address address;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private int capacity;
    private int entryPrice;
    private String description;

    @ManyToMany(mappedBy = "events")
    private List<User> guests;
}
