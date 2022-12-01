package org.launchcode.codingdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    private static List<String> events = new ArrayList<>();
    @GetMapping
    public String displayAllEvents(Model model){
        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
          return "events/index";
    }

    //lives at /events/create
    @GetMapping("create")
    public String displayCreateEventForm(Model model){
        model.addAttribute ("title", "Create Event");
        return "events/create";
    }

    //lives at /events/create
    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName){
        events.add(eventName);
        return "redirect:";
    }
}
