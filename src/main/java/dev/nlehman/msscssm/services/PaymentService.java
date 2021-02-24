package dev.nlehman.msscssm.services;

import dev.nlehman.msscssm.domain.Payment;
import dev.nlehman.msscssm.domain.PaymentEvent;
import dev.nlehman.msscssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);
    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
