package com.example.date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.*;

@RestController

public class MyController {

    @GetMapping("/")
    public String getnewdate() {
        LocalDate localtime = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String date= localtime.format(df);

        return date ;
    }

}
