package com.elijahjorell.projectportfoliobackend.repos;

import com.elijahjorell.projectportfoliobackend.models.Project;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProjectRepo extends CrudRepository<Project, Integer> {

    Iterable<Project> findByAuthorUsername(String username);

    @Modifying
    @Transactional
    @Query(value = "UPDATE project p SET p.title = ?1, p.goal = ?2 WHERE p.id = ?3", nativeQuery = true)
    void updateById(String newTitle, String newGoal, int id);

}
