package com.xmq291.xmq291fullstackangularspringboot.repository;

import com.xmq291.xmq291fullstackangularspringboot.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
}