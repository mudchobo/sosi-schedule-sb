package com.sosischedule.controllers;

import com.sosischedule.models.Schedule;
import com.sosischedule.models.Sosi;
import com.sosischedule.repositories.ScheduleRepository;
import com.sosischedule.repositories.SosiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jared on 15. 1. 2..
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private SosiRepository sosiRepository;

    @RequestMapping("{scheduleId}")
    public Schedule getSchedule(@PathVariable Long scheduleId) {
        Schedule schedule = scheduleRepository.findOne(scheduleId);
        Sosi sosi = schedule.getSosi();
        return schedule;
    }

    @RequestMapping("add/{sosiId}")
    public Schedule addSchedule(@PathVariable Long sosiId, @RequestParam(value="program") String program) {
        Sosi sosi = sosiRepository.findOne(sosiId);
        Schedule schedule = scheduleRepository.save(new Schedule(sosi, program));

        return schedule;
    }
}
