package com.xmq291.xmq291fullstackappangularspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.xmq291.xmq291fullstackappangularspringboot.entity.ReservationEntity;

public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
}