package com.sosischedule.repositories;

import com.sosischedule.models.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jared on 15. 1. 8..
 */
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
