package com.suri.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suri.entity.Device;

public interface DeviceRepository extends JpaRepository<Device, Integer> {

}
