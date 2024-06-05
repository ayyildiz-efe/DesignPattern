package org.springexample.abstractfactorydesignpattern.controller;

import org.springexample.abstractfactorydesignpattern.dto.PaymentRequest;
import org.springexample.abstractfactorydesignpattern.factory.PaypalFactory;
import org.springexample.abstractfactorydesignpattern.factory.SquareFactory;
import org.springexample.abstractfactorydesignpattern.factory.StripeFactory;
import org.springexample.abstractfactorydesignpattern.model.PaymentFactory;
import org.springexample.abstractfactorydesignpattern.model.PaymentProcessor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @PostMapping("/processPayment")
    public ResponseEntity<String> processPayment(@RequestBody PaymentRequest request) {
        PaymentFactory factory = createPaymentFactory(request.paymentProvider());
        PaymentProcessor processor = factory.createPaymentProcessor();
        // to observe the value actually these are should be void metod but i want to see the result
        String value = processor.processPayment(request.amount());
        return ResponseEntity.ok("Payment processed successfully : " + value);
    }

    private PaymentFactory createPaymentFactory(String paymentProvider) {
        switch (paymentProvider.toUpperCase()) {
            case "PAYPAL":
                return new PaypalFactory();
            case "STRIPE":
                return new StripeFactory();
            case "SQUARE" :
                return new SquareFactory();
            default:
                throw new IllegalArgumentException("Unsupported payment provider: " + paymentProvider);
        }

    }
}
