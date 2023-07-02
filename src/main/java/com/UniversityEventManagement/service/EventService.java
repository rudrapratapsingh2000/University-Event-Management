package com.UniversityEventManagement.service;

import com.UniversityEventManagement.model.EventModel;
import com.UniversityEventManagement.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;
    public List<EventModel> getAllEvents(LocalDate date) {
        return (List<EventModel>)eventRepository.findAllByDate(date);
    }

    public void addEvent(EventModel eventModel) {
        eventRepository.save(eventModel);
    }

    public void updateEvent(int number, EventModel updatedEvent) {
        EventModel  event=eventRepository.findById(number).get();
        event.setEventName(updatedEvent.getEventName());
        event.setLocationOfEvent(updatedEvent.getLocationOfEvent());
        event.setStartTime(updatedEvent.getStartTime());
        event.setEndTime(updatedEvent.getEndTime());
        event.setDate(updatedEvent.getDate());
        eventRepository.save(event);
    }

    public void deleteEvent(int number) {
        eventRepository.deleteById(number);
    }
}
