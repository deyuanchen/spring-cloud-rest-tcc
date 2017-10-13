package com.github.prontera.model.type.handler;

import com.github.prontera.domain.type.handler.GenericTypeHandler;
import com.github.prontera.model.type.OrderStatus;

/**
 * @author 陈德元
 */
public class OrderStatusHandler extends GenericTypeHandler<OrderStatus> {

    @Override
    public int getEnumIntegerValue(OrderStatus parameter) {
        return parameter.getCode();
    }
}
