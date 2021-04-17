package com.elijahjorell.projectportfoliobackend.services;

import com.elijahjorell.projectportfoliobackend.models.Project;
import com.elijahjorell.projectportfoliobackend.repos.PostRepo;
import com.elijahjorell.projectportfoliobackend.repos.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepo projectRepo;
    private final PostRepo postRepo;

    @Autowired
    public ProjectService(ProjectRepo projectRepo, PostRepo postRepo) {
        this.projectRepo = projectRepo;
        this.postRepo = postRepo;
    }

    public Project save(Project project) {
        return projectRepo.save(project);
    }

    public Project findById(int id) {
        Optional<Project> foundProject = projectRepo.findById(id);
        return foundProject.orElse(null);
    }

    public List<Project> findByAuthorUsername(String username) {
        List<Project> projects = new ArrayList<>();
        Iterable<Project> foundProjects = projectRepo.findByAuthorUsername(username);
        foundProjects.forEach(projects::add);
        return projects;
    }

    public Project updateById(int id, String newTitle, String newGoal) {
        projectRepo.updateById(newTitle, newGoal, id);
        return projectRepo.findById(id).orElse(null);
    }

    public void deleteById(int id) {
        postRepo.findByProjectId(id).forEach((foundPost) -> {
            postRepo.deleteById(foundPost.getId());
        });
        projectRepo.deleteById(id);
    }

}
