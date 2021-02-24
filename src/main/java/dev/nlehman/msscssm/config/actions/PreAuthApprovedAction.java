package dev.nlehman.msscssm.config.actions;

import dev.nlehman.msscssm.domain.PaymentEvent;
import dev.nlehman.msscssm.domain.PaymentState;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

@Component
public class PreAuthApprovedAction implements Action<PaymentState, PaymentEvent> {

    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> context) {
        System.out.println("Pre Auth Approved");
    }
}
