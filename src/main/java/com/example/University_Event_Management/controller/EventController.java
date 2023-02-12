package com.example.University_Event_Management.controller;

import com.example.University_Event_Management.model.Event;
import com.example.University_Event_Management.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("/addEvent")
    public String addEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }

    @PutMapping("/updateEvent/{eventId}")
    public String updateEvent(@PathVariable Integer eventId, @RequestBody Event event){
        return eventService.updateEvent(eventId, event);
    }
    @GetMapping("/getAllEvent")
    public List<Event> getEvent(){
        return eventService.getAllEvent();
    }
    @GetMapping("/getByDate/{eventDate}")
    public List<Event> getEventById(@PathVariable Integer eventDate){
        return eventService.getByDate(String.valueOf(eventDate));
    }
    @DeleteMapping("/deleteEvent/{eventId}")
    public String deleteEvent(@PathVariable Integer eventId){
        return eventService.deleteEvent(eventId);
    }
}
