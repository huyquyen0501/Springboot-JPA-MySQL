package demoboot.application.respository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import demoboot.application.entity.HelloWorld;

public interface HelloWorldRepository extends JpaRepository<HelloWorld, Integer>{

}
