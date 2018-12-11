package com.slx.zsxt.dao;

import com.slx.zsxt.model.Orders;

public interface OrdersMapper {
    int insert(Orders record);

    int insertSelective(Orders record);
}