package com.gek.ptime.server.persistance.repository;

import com.gek.ptime.server.persistance.model.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long>{
}
