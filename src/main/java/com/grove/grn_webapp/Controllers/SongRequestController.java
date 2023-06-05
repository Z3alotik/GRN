package com.grove.grn_webapp.Controllers;

import com.grove.grn_webapp.Dto.SongRequestDTO;
import com.grove.grn_webapp.Services.SongRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/songRequest")
@CrossOrigin
public class SongRequestController {

    @Autowired
    SongRequestService songRequestService;

    @PostMapping("/request")
    public ResponseEntity<String> request(@RequestBody SongRequestDTO songRequestDTO) {
        return songRequestService.createRequest(songRequestDTO);
    }
}
