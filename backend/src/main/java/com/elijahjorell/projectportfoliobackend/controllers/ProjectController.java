package com.elijahjorell.projectportfoliobackend.controllers;

import com.elijahjorell.projectportfoliobackend.models.Project;
import com.elijahjorell.projectportfoliobackend.services.ProjectService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin("*")
public class ProjectController {

    private static final Log LOGGER = LogFactory.getLog(ProjectController.class);

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/{username}/projects")
    @ResponseBody
    public List<Project> getPosts(@PathVariable String username) {
        LOGGER.info("Fetching projects of user with username=" + username);
        List<Project> foundProjects = projectService.findByAuthorUsername(username);
        LOGGER.info("Found " + foundProjects.size() + " projects");
        return foundProjects;
    }

}
