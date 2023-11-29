package com.edm.edmsystem.mapper;

import com.edm.edmsystem.dto.resources.PaymentResouce;
import com.edm.edmsystem.model.Payment;

public interface PaymentMapper {
    Payment mapPaymentResourceToPayment(PaymentResouce paymentResouce);
}
