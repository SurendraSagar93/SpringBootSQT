package com.suri.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



import lombok.Data;

@Data
@Entity
public class Device {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sku_id;
	
	@OneToMany(targetEntity = DeviceModel.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "device_model_id", referencedColumnName = "sku_id")
	private List<DeviceModel> deviceModels;

}
