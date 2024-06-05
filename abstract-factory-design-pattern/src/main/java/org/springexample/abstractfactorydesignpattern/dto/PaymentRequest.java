package org.springexample.abstractfactorydesignpattern.dto;

public record PaymentRequest(
        String paymentProvider,
        String paymentMetod,
        String amount
) {
}
