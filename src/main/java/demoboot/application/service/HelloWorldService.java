package demoboot.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demoboot.application.entity.HelloWorld;
import demoboot.application.respository.HelloWorldRepository;

@Service
public class HelloWorldService {
	@Autowired
	HelloWorldRepository helloWorldRepository;
	 public Iterable<HelloWorld> findAll(){
		 return helloWorldRepository.findAll();
	 }
	 public HelloWorld findOne(int id) {
		 return helloWorldRepository.findOne(id);
	 }
	 public void save(HelloWorld helloWorld) {
		 helloWorldRepository.save(helloWorld);
	 }
	 public void delete(int id) {
		 helloWorldRepository.delete(id);
	 }
}
