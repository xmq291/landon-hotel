package com.xmq291.xmq291fullstackangularspringboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.xmq291.xmq291fullstackangularspringboot.entity.RoomEntity;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
	
	RoomEntity findById(Long id);
}
