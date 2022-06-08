package com.suri.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class StorageCapacityList {
	
	@Id
	private Integer storageCapacityId;
	private Integer storageCapacity;
	private String measurementUnitType;

}
