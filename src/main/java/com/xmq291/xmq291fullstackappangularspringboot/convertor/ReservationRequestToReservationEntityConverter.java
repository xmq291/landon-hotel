package com.xmq291.xmq291fullstackappangularspringboot.convertor;


import com.xmq291.xmq291fullstackappangularspringboot.entity.ReservationEntity;
import com.xmq291.xmq291fullstackappangularspringboot.model.request.ReservationRequest;
import org.springframework.core.convert.converter.Converter;

public class ReservationRequestToReservationEntityConverter implements Converter<ReservationRequest, ReservationEntity> {

    @Override
    public ReservationEntity convert(ReservationRequest source) {

        ReservationEntity reservationEntity = new ReservationEntity();
        reservationEntity.setCheckin(source.getCheckin());
        reservationEntity.setCheckout(source.getCheckout());
        if (null != source.getId())
            reservationEntity.setId(source.getId());

        return reservationEntity;
    }
}