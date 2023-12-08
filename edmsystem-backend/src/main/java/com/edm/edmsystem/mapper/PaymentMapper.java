package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.PaymentInTableResource;
import com.edm.edmsystem.model.Payment;

public interface PaymentMapper {
    Payment mapPaymentResourceToPayment(PaymentInTableResource paymentInTableResource);

    PaymentInTableResource mapPaymentToPaymentInTableResource(Payment payment);
}
