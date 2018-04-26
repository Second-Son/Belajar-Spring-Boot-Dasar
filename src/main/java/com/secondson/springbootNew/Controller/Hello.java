package com.secondson.springbootNew.Controller;

import com.secondson.springbootNew.Model.Identitas;
import com.secondson.springbootNew.Services.IdentitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping(value = "/identitas/{id}")
	public Identitas getIdentitas(@PathVariable String id){
		return identitasService.getIdentitas(id);
	}

	@PostMapping(value = "/identitas/add")
	public void addIdentitas(@RequestBody Identitas identitas){
		System.out.println(identitas);
		identitasService.addIdentitas(identitas);
	}

	@PutMapping(value = "/identitas")
	public void updateIdentitas(@RequestBody Identitas identitas){
		identitasService.updateIdentitas(identitas);
	}

	@DeleteMapping(value = "/identitas/{id}")
	public void deleteIdentitas(@PathVariable String id){
		identitasService.deleteIdentitas(id);
	}
}
