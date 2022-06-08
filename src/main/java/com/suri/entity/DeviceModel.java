package com.suri.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



import lombok.Data;
@Data
@Entity
public class DeviceModel {
	
	@Id
	private Integer device_id;
	private String device_name;
	@OneToMany(targetEntity = StorageCapacityList.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "storages_fk", referencedColumnName = "device_id")
	private List<StorageCapacityList> storageCapacityLists;

}
