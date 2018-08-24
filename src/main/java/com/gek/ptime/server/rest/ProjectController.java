package com.gek.ptime.server.rest;

import com.gek.ptime.server.persistance.model.Project;
import com.gek.ptime.server.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    @Inject
    ProjectService projectService;
    private String projectId;

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public List<Project> getProjects() {
        List<Project> projects = new ArrayList<>();
        projects = projectService.getProjects();
        return projects;
    }

    @RequestMapping(value = "/project/save", method = RequestMethod.POST)
    public Project create(@RequestBody Project project) {
        return projectService.create(project);
    }

    @RequestMapping(value = "/project/{projectId}", method = RequestMethod.GET)
    public Project get( @PathVariable Long projectId) {
        return projectService.getOne(projectId);
    }

}
