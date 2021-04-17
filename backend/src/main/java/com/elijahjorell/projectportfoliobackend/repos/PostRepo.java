package com.elijahjorell.projectportfoliobackend.repos;

import com.elijahjorell.projectportfoliobackend.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {

}
