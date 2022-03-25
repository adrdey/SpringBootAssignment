package com.test.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entities.Designation;

@Repository
public interface DesignationDao extends JpaRepository<Designation, Integer>{

}
