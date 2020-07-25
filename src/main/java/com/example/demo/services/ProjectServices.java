package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.project;
import com.example.demo.repositories.ProjectRepository;


@Service
public class ProjectServices {
	@Autowired

	private ProjectRepository projectRepository;

	public List<project> getAllProject() {

		return projectRepository.findAll();
	}

	public project getProjectId(long id) {

		return projectRepository.findById(id).orElseThrow(null);
	}

	public List<project> getProjectByName(String name) {

		return projectRepository.findByName(name);
	}

	public void addproject (project newProject){
		projectRepository.save(newProject);
	}
	
	public void Modifyproject (project newProject){
		projectRepository.save(newProject);
	}
	
	public void deleteproject (long id) {
		projectRepository.deleteById(id);
	}
	
	public void archiveproject(long id, project pro){
        projectRepository.save(pro);
    }
	
	 public project restoreProject(long id){
         Optional<project>pro = projectRepository.findById(id);
         return pro.get();
    }
}
