package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.resources.PaymentResouce;
import com.edm.edmsystem.mapper.PaymentMapper;
import com.edm.edmsystem.model.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class PaymentMapperService implements PaymentMapper {
    @Override
    public Payment mapPaymentResourceToPayment(PaymentResouce paymentResouce) {
        return null;
    }

    @Override
    public PaymentResouce mapPaymentToPaymentResource(Payment payment) {
        return PaymentResouce.builder()
                .bankAccountNumber(payment.getBankAccountNumber())
                .exchangeRate(payment.getExchangeRate())
                .grossAmount(payment.getGrossAmount())
                .netAmount(payment.getNetAmount())
                .vatAmount(payment.getVatAmount())
                .vatRate(payment.getVatRate())
                .dueDate(payment.getDueDate())
                .currency(payment.getCurrency())
                .build();
    }
}
