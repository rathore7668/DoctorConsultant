package com.me;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.me.entity.Doctor;
import com.me.service.DoctorService;


@SpringBootTest
public class DoctorRepoTest {
	
	@MockBean
 private DoctorService DoctorService;
	
	@Test
	public void testRegister() {
		Doctor Doctor = new Doctor(2,"bvk","abc@gmail.com");
		
		Mockito.when(DoctorService.registerDoctor(Doctor)).thenReturn(Doctor);
	}
	
	@Test
	public void testGet() {
		Doctor Doctor = new Doctor(2, "bvk" ,"abcd@gmail.com");
		
		Mockito.when(DoctorService.getDoctor(2)).thenReturn(Doctor);
	}
}