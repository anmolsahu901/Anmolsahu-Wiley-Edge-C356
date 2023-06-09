package com.example.demo.Utils;

import com.example.demo.exception.InSufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String,Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("ac_1",9000.0);
        paymentMap.put("ac_2",12000.0);
        paymentMap.put("ac_3",6000.0);
        paymentMap.put("ac_4",8000.0);
    }

    public static boolean validateCreditLimit(String accNo,double paidAccount){
        if(paidAccount>paymentMap.get(accNo))
        {
            throw new InSufficientAmountException(("Insufficient balance...!!!"));
        }
        else
            return true;

    }

}
