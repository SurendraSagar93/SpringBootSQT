package com.suri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suri.dto.DeviceRequest;

import com.suri.entity.Device;

import com.suri.repo.DeviceModelRepository;
import com.suri.repo.DeviceRepository;
import com.suri.repo.StorageCapacityRepository;

@RestController
public class DeviceController {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@Autowired
	private DeviceModelRepository deviceModelRepository;
	
	@Autowired
	private StorageCapacityRepository storageCapacityRepository;
	
	@PostMapping("/device")
	public Device placeOrder(@RequestBody DeviceRequest request) {
		return deviceRepository.save(request.getDevice());
		
	}
	
	@GetMapping("/findAll")
	public List<Device>findAllCustomer(){
		return deviceRepository.findAll();
	}
	

}
