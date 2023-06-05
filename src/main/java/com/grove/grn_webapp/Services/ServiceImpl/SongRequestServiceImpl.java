package com.grove.grn_webapp.Services.ServiceImpl;

import com.grove.grn_webapp.Dto.SongRequestDTO;
import com.grove.grn_webapp.Exceptions.UserNotFoundByIdException;
import com.grove.grn_webapp.Model.SongRequest;
import com.grove.grn_webapp.Model.User;
import com.grove.grn_webapp.Repositories.SongRepository;
import com.grove.grn_webapp.Repositories.UserRepository;
import com.grove.grn_webapp.Services.SongRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SongRequestServiceImpl implements SongRequestService {

    @Autowired
    SongRepository songRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseEntity<String> createRequest(SongRequestDTO songRequestDTO) {

        User user = userRepository.findById(songRequestDTO.getUserId())
                .orElseThrow(() -> new UserNotFoundByIdException("User not found by ID: " + songRequestDTO.getUserId()));

        SongRequest songRequest = SongRequest.builder()
                .title(songRequestDTO.getTitle())
                .artistName(songRequestDTO.getArtistName())
                .youtubeUrl(songRequestDTO.getYoutubeUrl())
                .user(user)
                .build();


        songRepository.save(songRequest);

        return ResponseEntity.ok().body("Song request successfully created !!");
    }
}
