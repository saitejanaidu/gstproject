package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class controller {

@Autowired
curdrepo cr;
@GetMapping("/productslist")
@CrossOrigin("http://localhost:4200")
public List<product> fetchprodlist(){
	return cr.findAll();
	
}
@PostMapping("/addproduct")
@CrossOrigin(origins="http://localhost:4200")
public product addproftodb(@RequestBody product pro) {
	 return cr.save(pro);
}
@GetMapping("/getpbid/{id}")
@CrossOrigin(origins="http://localhost:4200")
public product returnprobyid(@PathVariable int id){
	return cr.getOne(id);
}
	
@DeleteMapping("/delpdid/{id}")
@CrossOrigin(origins="http://localhost:4200")
public String delpbid(@PathVariable int id){
	cr.deleteById(id);
	return "succesfully deleted";
}
	
}
