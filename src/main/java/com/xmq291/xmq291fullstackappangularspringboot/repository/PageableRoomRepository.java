package com.xmq291.xmq291fullstackappangularspringboot.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.xmq291.xmq291fullstackappangularspringboot.entity.RoomEntity;

public interface PageableRoomRepository extends PagingAndSortingRepository<RoomEntity, Long> {

	Page<RoomEntity> findById(Long id, Pageable page);

}