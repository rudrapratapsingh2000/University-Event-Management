package com.UniversityEventManagement.controller;

import com.UniversityEventManagement.model.EventModel;
import com.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/event-app")
public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping("/findEvent-api/date/{date}")
    public List<EventModel> findEvent(@PathVariable LocalDate date){
        return eventService.getAllEvents(date);
    }
    @PostMapping("/add-api")
    public void addEvent(@RequestBody EventModel eventModel){
        eventService.addEvent(eventModel);
    }
    @PutMapping("/update-api/number/{number}")
    public  void updateEvent(@PathVariable int number, @RequestBody EventModel eventModel){
        eventService.updateEvent(number,eventModel);
    }
    @DeleteMapping("/delete-api/number/{number}")
    public void deleteEvent(@PathVariable int number){
        eventService.deleteEvent(number);
    }

}
