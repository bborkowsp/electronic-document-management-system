package com.edm.edmsystem.mapper.internal;

import com.edm.edmsystem.dto.resources.PaymentInTableResource;
import com.edm.edmsystem.dto.resources.PaymentResource;
import com.edm.edmsystem.mapper.PaymentMapper;
import com.edm.edmsystem.model.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class PaymentMapperService implements PaymentMapper {

    @Override
    public PaymentResource mapPaymentToPaymentResource(Payment payment) {
        return PaymentResource.builder()
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

    @Override
    public PaymentInTableResource mapPaymentToPaymentInTableResource(Payment payment) {
        return PaymentInTableResource.builder()
                .grossAmount(payment.getGrossAmount())
                .netAmount(payment.getNetAmount())
                .currency(payment.getCurrency())
                .build();
    }
}
