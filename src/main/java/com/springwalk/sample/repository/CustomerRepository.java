package com.springwalk.sample.repository;

import org.springframework.data.repository.CrudRepository;

import com.springwalk.sample.entities.Name;

public interface CustomerRepository extends CrudRepository<Name,Integer>{

}
