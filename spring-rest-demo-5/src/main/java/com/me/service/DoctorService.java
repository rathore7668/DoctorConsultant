package com.me.service;

import java.util.List;

import com.me.entity.Doctor;
import com.me.exception.DoctorNotFoundException;

public interface DoctorService {
	public Doctor registerDoctor(Doctor Doctor);
	public Doctor updateDoctor(Doctor Doctor);
	public Doctor deleteDoctor(int age) throws DoctorNotFoundException;
	public Doctor getDoctor(int age) throws DoctorNotFoundException;
	public List<Doctor> getDoctor();
}