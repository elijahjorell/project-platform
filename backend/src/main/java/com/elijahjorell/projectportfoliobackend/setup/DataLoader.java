package com.elijahjorell.projectportfoliobackend.setup;

import com.elijahjorell.projectportfoliobackend.models.Post;
import com.elijahjorell.projectportfoliobackend.models.Project;
import com.elijahjorell.projectportfoliobackend.models.User;
import com.elijahjorell.projectportfoliobackend.services.PostService;
import com.elijahjorell.projectportfoliobackend.services.ProjectService;
import com.elijahjorell.projectportfoliobackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private final UserService userService;
    private final ProjectService projectService;
    private final PostService postService;

    @Autowired
    public DataLoader(UserService userService, ProjectService projectService, PostService postService) {
        this.userService = userService;
        this.projectService = projectService;
        this.postService = postService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User elijahjorell = userService.save(new User("elijahjorell"));
        Project pythonApi = projectService.save(new Project(elijahjorell, "Python APIs", "Build an API using Python"));
        postService.save(new Post(elijahjorell, pythonApi, "Started a new project!"));
    }

}
