package com.example.barbershop.Record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
@RestController
@RequestMapping(path="api/v1/Record")
public class RecordController
{
    private final RecordService recordService;
    @Autowired
    public RecordController(RecordService recordService)
    {
        this.recordService=recordService;
    }
    @GetMapping
    public List<Record> getRecord()
    {
        return recordService.getRecord();

    }
}
