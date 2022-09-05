package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping
    public String newGreeting(@RequestParam(value = "name") String name, @RequestParam(value = "timeOfDay") String timeOfDay) {
        Greeting greeting = new Greeting(name, timeOfDay);
        return "Good " + greeting.getTimeOfDay() + ", " + greeting.getName() + "!";
    }

    @GetMapping(value = "/christmas")
    public Celebration newCelebration() {
        return new Celebration("Merry Christmas!");
    }

}
