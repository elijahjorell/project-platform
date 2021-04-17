package com.elijahjorell.projectportfoliobackend.services;

import com.elijahjorell.projectportfoliobackend.models.Post;
import com.elijahjorell.projectportfoliobackend.repos.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public final PostRepo postRepo;

    @Autowired
    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    public Post save(Post post) {
        return postRepo.save(post);
    }

    public List<Post> findAll() {
        List<Post> posts = new ArrayList<>();
        Iterable<Post> foundPosts = postRepo.findAll();
        foundPosts.forEach(posts::add);
        return posts;
    }

    public List<Post> findByProjectId(int id) {
        List<Post> posts = new ArrayList<>();
        Iterable<Post> foundPosts = postRepo.findByProjectId(id);
        foundPosts.forEach(posts::add);
        return posts;
    }

    public void deleteById(int id) {
        postRepo.deleteById(id);
    }

}
