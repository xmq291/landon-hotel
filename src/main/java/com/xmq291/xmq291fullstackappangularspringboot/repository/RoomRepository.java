package com.xmq291.xmq291fullstackappangularspringboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.xmq291.xmq291fullstackappangularspringboot.entity.RoomEntity;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
	
	RoomEntity findById(Long id);
}

