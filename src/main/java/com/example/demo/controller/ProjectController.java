package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;
import com.example.demo.model.project;
import com.example.demo.services.ProjectServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
		@Autowired
		private ProjectServices projectServices;
		/*List<project> pro= new ArrayList<project>();
		pro.add(new project(1, "project1", "java", true));
		pro.add(new project(2, "project2", "c++", false));
		pro.add(new project(3, "project3", "c", true));*/
		
		@GetMapping("/projects")
		public List<project>getAllProject(){
		return projectServices.getAllProject();
		}
		
		@GetMapping("/projectID")
		public project getProjectId(@RequestParam long id){
		return projectServices.getProjectId(id);
		}
			
		@GetMapping("/projectName")
		public List<project> getProjectName(@RequestParam String name){
		return projectServices.getProjectByName(name);
		}
		
		@PostMapping("/project")
		public String addproject(@RequestBody project newproject) {
			projectServices.addproject(newproject);
			return "saved ok";
		}
		
		@PutMapping("/project")
		public String Modifyproject(@RequestBody project newproject) {
			projectServices.addproject(newproject);
			return "modify ok";
		}
		
		@DeleteMapping("/project")
		public String deleteproject(@RequestParam long id) {
			projectServices.deleteproject(id);
			return "delete ok";
		}
		
		@PostMapping("/archive/{projectId}")
	    public void archiveProject(@RequestBody project pro, @PathVariable long id){
	        projectServices.archiveproject(id,pro);
	    }

	    @GetMapping("/archive/{projectId}")
	    public project restoreProjectFromArchive(@PathVariable long id){
	        return projectServices.restoreProject(id);
	    }
}

