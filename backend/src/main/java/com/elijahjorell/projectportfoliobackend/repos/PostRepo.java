package com.elijahjorell.projectportfoliobackend.repos;

import com.elijahjorell.projectportfoliobackend.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {

    Iterable<Post> findByProjectId(int id);

}
