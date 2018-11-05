package com.xmq291.xmq291fullstackappangularspringboot.repository;

import com.xmq291.xmq291fullstackappangularspringboot.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
}