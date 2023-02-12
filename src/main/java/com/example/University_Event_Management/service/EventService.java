package com.example.University_Event_Management.service;

import com.example.University_Event_Management.model.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    static List<Event> eventList = new ArrayList<>();
    static{
        eventList.add(new Event(1, "Cricket", "College_Ground", "15", "12pm", "5pm"));
        eventList.add(new Event(2, "BasketBall", "Basket_Court", "16", "12pm", "5pm"));
        eventList.add(new Event(3, "Swimming", "Pool_Area", "17", "12pm", "5pm"));
    }
    public String addEvent(Event event){
        eventList.add(event);
        return "Event is added in the Database !";
    }
    public String updateEvent(Integer eventId, Event event){
        if(eventList.contains(eventId)){
            event.setEventName(event.getEventName());
            event.setLocationOfEvent(event.getLocationOfEvent());
            event.setDate(event.getDate());
            event.setStartTime(event.getStartTime());
            event.setEndTime(event.getEndTime());
        }
        return "Event is updated in the Database!";
    }

    public List<Event> getAllEvent() {
        return eventList;
    }

    public List<Event> getByDate(String eventDate1) {
        List<Event> newEventList = new ArrayList<>();
        for(Event event : eventList){
            if(event.getDate().equals(eventDate1)){
                newEventList.add(event);
            }
        }
        return newEventList;
    }

    public String deleteEvent(Integer eventId) {
        eventList.removeIf(event -> event.getEventId().equals(eventId));
        return "Student is removed from Database !";
    }
}
