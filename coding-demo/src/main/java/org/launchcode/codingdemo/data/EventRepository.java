package org.launchcode.codingdemo.data;

import org.launchcode.codingdemo.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
//extends CRUD repository
