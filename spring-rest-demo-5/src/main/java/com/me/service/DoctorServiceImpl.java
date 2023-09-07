package com.me.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.dao.DoctorRepository;
import com.me.entity.Doctor;
import com.me.exception.DoctorNotFoundException;

@Service
public  class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository docRepo;
	
	@Override
	public Doctor registerDoctor(Doctor Doctor) {
		return docRepo.save(Doctor);
	}

	@Override
	public Doctor updateDoctor(Doctor Doctor) {
		return docRepo.save(Doctor);
	}

	@Override
	public Doctor deleteDoctor(int age)  throws DoctorNotFoundException{
		Optional<Doctor> Doctor= docRepo.findById(age);
		
		Doctor doc = null;
		if(Doctor.isPresent()) {
			docRepo.deleteById(age);
			doc = Doctor.get();
		}else {
			throw new DoctorNotFoundException("No such Doctor");
		}
		return doc;
	}

	@Override
	public Doctor getDoctor(int age)  throws DoctorNotFoundException{
		Optional<Doctor> Doctor = docRepo.findById(age);
		Doctor doc = null;
		if(Doctor.isPresent()) {
			doc = Doctor.get();
		}else {
			throw new DoctorNotFoundException("No such Doctor");
		}
		return doc;
	}

	@Override
	public List<Doctor> getDoctor() {
		return docRepo.findAll();
	}

	/*
	 * @Override public Doctor registerDoctor(Doctor Doctor) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public Doctor updateDoctor(Doctor Doctor) { // TODO Auto-generated
	 * method stub return null; }
	 */
}