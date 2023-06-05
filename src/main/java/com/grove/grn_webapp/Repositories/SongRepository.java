package com.grove.grn_webapp.Repositories;

import com.grove.grn_webapp.Model.SongRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SongRepository extends JpaRepository<SongRequest, Long> {


}
