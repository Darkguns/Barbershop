package com.example.barbershop.Record;

import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Record
{

    private String firstname;
    private LocalDateTime date;
    private long telephonNumber;
    public Record() {

    }
    public Record(String firstname, LocalDateTime date, long telephonNumber)
    {
        this.firstname=firstname;
        this.date=date;
        this.telephonNumber=telephonNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public long getTelephonNumber() {
        return telephonNumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setTelephonNumber(long telephonNumber) {
        this.telephonNumber = telephonNumber;
    }

    @Override
    public String toString() {
        return "Record{" +
                "firstname='" + firstname + '\'' +
                ", date=" + date +
                ", telephonNumber=" + telephonNumber +
                '}';
    }
}


