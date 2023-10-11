package com.example.barbershop.Record;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
@Service
public class RecordService {
    @GetMapping
    public List<Record> getRecord()
    {
        return List.of(new Record("Rodionov", LocalDateTime.of(2023, Month.JULY, 12, 18, 30), 1234));

    }
}
