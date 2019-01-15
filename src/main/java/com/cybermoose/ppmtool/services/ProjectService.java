package com.cybermoose.ppmtool.services;

import com.cybermoose.ppmtool.domain.Project;
import com.cybermoose.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdate (Project project) {

        //Logic goes here

        return projectRepository.save(project);
    }

}
