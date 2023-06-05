package com.grove.grn_webapp.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "songRequests")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class SongRequest {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String artistName;
    private String youtubeUrl;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
