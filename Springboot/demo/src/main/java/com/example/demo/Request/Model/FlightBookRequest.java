package com.example.demo.Request.Model;

import com.example.demo.model.PassengerInfo;
import com.example.demo.model.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
