package com.elijahjorell.projectportfoliobackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id @GeneratedValue private int id;
    @ManyToOne private User author;
    @OneToMany(mappedBy = "project") @JsonIgnore private List<Post> posts;

    public Project() {
        super();
    }

    public Project(int id, User author) {
        this.id = id;
        this.author = author;
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

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", author=" + author +
                '}';
    }

}
