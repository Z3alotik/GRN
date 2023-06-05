package com.grove.grn_webapp.Controllers;

import com.grove.grn_webapp.Dto.EventDTO;
import com.grove.grn_webapp.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/event")
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody EventDTO eventDTO) {
        return eventService.createEvent(eventDTO);
    }
}
