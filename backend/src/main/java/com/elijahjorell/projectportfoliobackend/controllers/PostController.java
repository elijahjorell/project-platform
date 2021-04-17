package com.elijahjorell.projectportfoliobackend.controllers;

import com.elijahjorell.projectportfoliobackend.models.Post;
import com.elijahjorell.projectportfoliobackend.services.PostService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin("*")
public class PostController {

    private static final Log LOGGER = LogFactory.getLog(PostController.class);

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    @ResponseBody
    public List<Post> findAll() {
        LOGGER.info("Fetching all posts");
        List<Post> foundPosts = postService.findAll();
        LOGGER.info("Serving " + foundPosts.size() + " post(s)");
        return foundPosts;
    }

}
