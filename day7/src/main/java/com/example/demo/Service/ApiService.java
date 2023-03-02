package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.Car;
import com.example.demo.Repo.CarRepo;
@Service
public class ApiService {
	@Autowired
	private CarRepo det;
	public Car saveDetails(Car s) {
		return det.save(s);
	}
	public List<Car> findByOwners(@PathVariable int owners) {
		List<Car> arr = new ArrayList<>();
		arr = det.findByOwners(owners);
		return arr;
	}
	public List<Car> findByAddress(@PathVariable String address) {
		List<Car> arr = new ArrayList<>();
		arr = det.findByAddress(address);
		return arr;
	}
	public List<Car> findByCarname(@PathVariable String carname) {
		List<Car> arr = new ArrayList<>();
		arr = det.findByCarname(carname);
		return arr;
	}
	public List<Car> findByOwnersAndCartype(@PathVariable int owners,@PathVariable String cartype) {
		List<Car> arr = new ArrayList<>();
		arr = det.findByOwnersAndCartype(owners,cartype);
		return arr;
	}

}


