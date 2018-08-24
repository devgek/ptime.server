package com.gek.ptime.server.service;


import com.gek.ptime.server.persistance.model.Project;
import com.gek.ptime.server.persistance.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class ProjectService {
	@Inject
	ProjectRepository projectRepository;

	public Project getOne(Long id) {
		return projectRepository.findOne(id);
	}

	public List<Project> getProjects() {
		return (List<Project>) projectRepository.findAll();
	}

	public Project create (Project project) {
		return projectRepository.save(project);
	}

	public Project create(String title, String subTitle, String company, String colorCode, int priority, boolean active) {
		Project p = new Project();
		p.setTitle(title);
		p.setSubTitle(subTitle);
		p.setCompany(company);
		p.setColorCode(colorCode);
		p.setPriority(priority);
		p.setActive(active);

		return projectRepository.save(p);
	}
}
