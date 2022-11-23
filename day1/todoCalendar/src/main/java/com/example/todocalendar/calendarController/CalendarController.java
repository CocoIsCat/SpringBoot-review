package com.example.todocalendar.calendarController;

import com.example.todocalendar.dto.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CalendarController {

    ArrayList<Calendar> todoCalendar = new ArrayList<>();

    @GetMapping("all/schedule")
    public ArrayList<Calendar> allSchedule() {
        return todoCalendar;
    }

    @GetMapping("put/schedule")
    public ArrayList<Calendar> putSchedule(Calendar calendar) {
        todoCalendar.add(calendar);
        return todoCalendar;
    }
}
