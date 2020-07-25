package com.example.demo.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.demo.model.project;

@Repository
public interface ProjectRepository extends JpaRepository<project, Long>{
	public List<project> findByName(String name);
		
	}

