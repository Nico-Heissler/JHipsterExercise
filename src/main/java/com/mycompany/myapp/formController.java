package com.mycompany.myapp;

import java.io.FileReader;
import java.io.IOException;

import com.adyen.Client;
import com.adyen.enums.Environment;
import com.adyen.model.Amount;
import com.adyen.model.checkout.PaymentsRequest;
import com.adyen.model.checkout.PaymentsResponse;
import com.adyen.service.Checkout;
import com.adyen.service.exception.ApiException;

import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class formController {

    @RequestMapping (value = "/paiement", method = RequestMethod.POST)
    void paiement(@RequestBody String JSON) throws ApiException, IOException {
        
       System.out.println(JSON);
        
        /*// Set your X-API-KEY with the API key from the Customer Area.
        System.out.println("username");
        
        String xApiKey = "AQEmhmfuXNWTK0Qc+iSZoUEWhueYR55DGdCTbzzxbLZc1XoVatyQFrkQwV1bDb7kfNy1WIxIIkxgBw==-5bRrb1YHyfeFZ12efxwNavj07PSVHOMij9M8CFJApb8=-nuI3tr$_6H8T%xNz";          
        Client client = new Client(xApiKey,Environment.TEST);
        Checkout checkout = new Checkout(client);
        PaymentsRequest paymentsRequest = new PaymentsRequest();
        paymentsRequest.setMerchantAccount("ISENAccountECOM");
        String encryptedCardNumber = "test_4111111111111111";
        String encryptedExpiryMonth = "test_03";
        String encryptedExpiryYear = "test_2030";
        String encryptedSecurityCode = "test_737";
        paymentsRequest.addEncryptedCardData(encryptedCardNumber,encryptedExpiryMonth, encryptedExpiryYear, encryptedSecurityCode);
        Amount amount = new Amount();
        amount.setCurrency("EUR");
        amount.setValue(1000L);
        paymentsRequest.setAmount(amount);
        paymentsRequest.setReference("Your order number");
        paymentsRequest.setReturnUrl("https://your-company.com/checkout?shopperOrder=12xy..");
        PaymentsResponse paymentsResponse = checkout.payments(paymentsRequest);*/
    }
}

