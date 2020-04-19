package com.example.wbdvsp20astefanifinalprojectserver.repositories;

import com.example.wbdvsp20astefanifinalprojectserver.models.Event;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

  @Query(value = "SELECT * FROM Event event", nativeQuery = true)
  List<Event> findAllEvents();


  @Query(value ="SELECT * FROM Event event WHERE host_id=:hostId", nativeQuery = true)
  public List<Event> findEventsByHost(@Param("hostId") Integer hostId);


  @Query(value = "SELECT * FROM Event event WHERE id=:id", nativeQuery = true)
  public Event findByEventById(@Param("id") Integer id);

}


