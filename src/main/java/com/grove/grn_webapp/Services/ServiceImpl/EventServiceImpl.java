package com.grove.grn_webapp.Services.ServiceImpl;

import com.grove.grn_webapp.Dto.EventDTO;
import com.grove.grn_webapp.Model.Address;
import com.grove.grn_webapp.Model.Event;
import com.grove.grn_webapp.Repositories.EventRepository;
import com.grove.grn_webapp.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public ResponseEntity<String> createEvent(EventDTO eventDTO) {

        Address address = Address.builder()
                .zip(eventDTO.getAddress().getZip())
                .houseNumber(eventDTO.getAddress().getHouseNumber())
                .street(eventDTO.getAddress().getStreet())
                .city(eventDTO.getAddress().getCity())
                .build();

    Event event = Event.builder()
            .title(eventDTO.getTitle())
            .address(address)
            .startDate(eventDTO.getStartDate())
            .endDate(eventDTO.getEndDate())
            .startTime(eventDTO.getStartTime())
            .endTime(eventDTO.getEndTime())
            .capacity(eventDTO.getCapacity())
            .entryPrice(eventDTO.getEntryPrice())
            .description(eventDTO.getDescription())
            .build();

    eventRepository.save(event);

    return ResponseEntity.ok().build();
    }
}
