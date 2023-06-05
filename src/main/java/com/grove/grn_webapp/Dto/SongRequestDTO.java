package com.grove.grn_webapp.Dto;

import com.grove.grn_webapp.Model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SongRequestDTO {
    private String title;
    private String artistName;
    private String youtubeUrl;
    private Long userId;
}
