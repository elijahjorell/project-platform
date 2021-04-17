package com.elijahjorell.projectportfoliobackend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {

    @Id @GeneratedValue private int id;
    @ManyToOne private User author;
    @ManyToOne private Project project;
    private String content;

    public Post() {
        super();
    }

    public Post(User author, Project project, String content) {
        this.author = author;
        this.project = project;
        this.content = content;
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", author=" + author +
                ", project=" + project +
                ", content='" + content + '\'' +
                '}';
    }

}
