package com.grove.grn_webapp.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User  {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String surname;
    private String email;
    private String password;

    @ManyToMany
    @JoinTable(name = "event_guests",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<Event> events;

    @OneToMany(mappedBy = "user")
    private List<SongRequest> songRequests;
}
