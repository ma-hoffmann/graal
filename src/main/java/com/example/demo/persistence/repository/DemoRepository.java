package com.example.demo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.persistence.entity.Demo;

@RepositoryRestResource(collectionResourceRel = "demo", path = "demo")
public interface DemoRepository extends JpaRepository<Demo, Long> {

}
