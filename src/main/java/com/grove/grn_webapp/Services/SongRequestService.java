package com.grove.grn_webapp.Services;

import com.grove.grn_webapp.Dto.SongRequestDTO;
import org.springframework.http.ResponseEntity;

public interface SongRequestService {

    ResponseEntity<String> createRequest(SongRequestDTO songRequestDTO);
}
