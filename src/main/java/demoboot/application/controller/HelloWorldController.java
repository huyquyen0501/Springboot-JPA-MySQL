package demoboot.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demoboot.application.entity.HelloWorld;
import demoboot.application.service.HelloWorldService;

@RestController
@RequestMapping("helloworld")
public class HelloWorldController {
	@Autowired
	private HelloWorldService helloWorldService;

	@RequestMapping("/getall")
	public List<HelloWorld> getAll() {
		return (List<HelloWorld>) helloWorldService.findAll();
	}

	@RequestMapping("/findbyid/{id}")
	public HelloWorld getByID(@PathVariable("id") int id) {
		System.out.println("Nhap vao id can tim: ");
		HelloWorld hello = helloWorldService.findOne(id);
		if (hello == null) {
			System.out.println(id + " khong ton tai");
			return hello;
		} else {
			return hello;
		}
	}

	@PostMapping("/add")
	public HelloWorld add(@RequestBody HelloWorld helloWorld) {
		System.out.println("Da them: " + helloWorld);
		helloWorldService.save(helloWorld);
		return helloWorld;
	}

	@DeleteMapping("/deleted/{id}")
	public void deleteByID(@PathVariable("id") int id) {
		HelloWorld temp = helloWorldService.findOne(id);
		if (temp == null) {
			System.out.println("Id khong ton tai");
		} else {
			helloWorldService.delete(id);
		}
	}
}
