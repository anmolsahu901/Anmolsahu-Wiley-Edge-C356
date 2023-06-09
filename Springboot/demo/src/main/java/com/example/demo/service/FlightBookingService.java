package com.example.demo.service;

import com.example.demo.Request.Model.FlightBookRequest;
import com.example.demo.Response.Model.FlightBookingAck;
import com.example.demo.Utils.PaymentUtils;
import com.example.demo.model.PassengerInfo;
import com.example.demo.model.PaymentInfo;
import com.example.demo.repository.PassengerInfoRepository;
import com.example.demo.repository.PaymentInfoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerRepo;

    @Autowired
    private PaymentInfoRepository paymentRepo;

    @Transactional
    public FlightBookingAck bookFlightTicket(FlightBookRequest request){
       PassengerInfo passengerInfo = request.getPassengerInfo();
        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getPid());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentRepo.save(paymentInfo);

        return new FlightBookingAck("SUCCESS",
passengerInfo.getFare(),
                UUID.randomUUID().toString().split("-")[0]
                ,passengerInfo);

    }

}
