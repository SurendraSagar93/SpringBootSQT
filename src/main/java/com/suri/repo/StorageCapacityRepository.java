package com.suri.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suri.entity.StorageCapacityList;

public interface StorageCapacityRepository extends JpaRepository<StorageCapacityList, Integer> {

}
