package com.UniversityEventManagement.repository;

import com.UniversityEventManagement.model.EventModel;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;

public interface EventRepository extends CrudRepository<EventModel,Integer> {
    Object findAllByDate(LocalDate date);
}
