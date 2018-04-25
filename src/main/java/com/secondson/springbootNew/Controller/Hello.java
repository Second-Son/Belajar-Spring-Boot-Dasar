package com.secondson.springbootNew.Controller;

import com.secondson.springbootNew.Model.Identitas;
import com.secondson.springbootNew.Services.IdentitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Hello {

	@Autowired
	private IdentitasService identitasService;

	@GetMapping("/hello")
	public String Hello() {
		return "Hello";
	}


	@GetMapping("/identitas")
	public List<Identitas> identitasList(){
		return identitasService.getAllIdentitas();
	}
}
