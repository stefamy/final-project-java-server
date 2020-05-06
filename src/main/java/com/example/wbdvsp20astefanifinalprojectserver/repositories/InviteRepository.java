package com.example.wbdvsp20astefanifinalprojectserver.repositories;

import com.example.wbdvsp20astefanifinalprojectserver.models.Invite;
import com.example.wbdvsp20astefanifinalprojectserver.models.Event;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface InviteRepository extends CrudRepository<Invite, Integer> {

    @Query(value = "SELECT * FROM Invite invite", nativeQuery = true)
    List<Invite> findAllInvites();


    @Query(value ="SELECT * FROM Invite invite WHERE event_id=:eventId", nativeQuery = true)
    public List<Invite> findAllInvitesForEvent(@Param("eventId") Integer eventId);


    @Query(value = "SELECT * FROM Invite invite WHERE id=:id", nativeQuery = true)
    public Invite findInviteById(@Param("id") Integer id);

    @Query(value = "SELECT * FROM Invite invite WHERE guest_id=:userId", nativeQuery = true)
    public List<Invite> findInvitesByGuestId(@Param("userId") Integer userId);

    @Query(value = "SELECT * FROM Invite invite WHERE guest_id=:userId AND response='Yes'", nativeQuery = true)
    public List<Invite> findAcceptedInvitesByGuestId(@Param("userId") Integer userId);

}


