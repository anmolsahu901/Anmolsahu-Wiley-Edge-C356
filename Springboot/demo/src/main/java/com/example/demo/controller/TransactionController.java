package com.example.demo.controller;

import com.example.demo.Request.Model.FlightBookRequest;
import com.example.demo.Response.Model.FlightBookingAck;
import com.example.demo.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/vi")
public class TransactionController {

    @Autowired
    private FlightBookingService service;

    @PostMapping("/bookFlightTicket")
    public FlightBookingAck bookFlightTicket(@RequestBody FlightBookRequest request){
        return  service.bookFlightTicket(request);
    }
}
