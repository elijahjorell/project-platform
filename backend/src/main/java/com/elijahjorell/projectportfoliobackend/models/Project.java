package com.elijahjorell.projectportfoliobackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id @GeneratedValue private int id;
    @ManyToOne private User author;
    private String title;
    private String goal;
    @OneToMany(mappedBy = "project") @JsonIgnore private List<Post> posts;

    public Project() {
        super();
    }

    public Project(User author, String title, String goal) {
        this.author = author;
        this.title = title;
        this.goal = goal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", author=" + author +
                '}';
    }

}
