package com.sosischedule.controllers;

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
@RequestMapping("/sosi")
public class SosiController {

    @Autowired
    private SosiRepository sosiRepository;

    @RequestMapping("{sosiId}")
    public Sosi getSosi(@PathVariable Long sosiId) {
        Sosi sosi = sosiRepository.findOne(sosiId);
        return sosi;
    }
}
