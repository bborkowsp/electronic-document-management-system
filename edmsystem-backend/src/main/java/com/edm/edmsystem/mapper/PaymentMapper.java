package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.PaymentInTableResource;
import com.edm.edmsystem.dto.resources.PaymentResource;
import com.edm.edmsystem.model.Payment;

public interface PaymentMapper {
    PaymentResource mapPaymentToPaymentResource(Payment payment);

    PaymentInTableResource mapPaymentToPaymentInTableResource(Payment payment);
}
