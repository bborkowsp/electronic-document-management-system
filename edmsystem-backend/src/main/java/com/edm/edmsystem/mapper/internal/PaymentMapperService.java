package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.resources.PaymentInTableResource;
import com.edm.edmsystem.mapper.PaymentMapper;
import com.edm.edmsystem.model.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class PaymentMapperService implements PaymentMapper {
    @Override
    public Payment mapPaymentResourceToPayment(PaymentInTableResource paymentInTableResource) {
        return null;
    }

    @Override
    public PaymentInTableResource mapPaymentToPaymentInTableResource(Payment payment) {
        return PaymentInTableResource.builder()
                .grossAmount(payment.getGrossAmount())
                .netAmount(payment.getNetAmount())
                .currency(payment.getCurrency())
                .build();
    }
}
