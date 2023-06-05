package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.Dto.EventDTO;
import com.grove.grn_webapp.Model.Event;
import org.springframework.http.ResponseEntity;

public interface EventService {

    ResponseEntity<String> createEvent(EventDTO eventDTO);
}
