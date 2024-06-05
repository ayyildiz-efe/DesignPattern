package org.springexample.abstractfactorydesignpattern.factory;

import org.springexample.abstractfactorydesignpattern.model.CreditCardPayment;
import org.springexample.abstractfactorydesignpattern.model.PaymentFactory;
import org.springexample.abstractfactorydesignpattern.model.PaymentProcessor;
import org.springexample.abstractfactorydesignpattern.model.WalletPayment;

public class SquareFactory implements PaymentFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new WalletPayment();
    }
}
