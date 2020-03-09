package com.codegym.model;


import javax.persistence.*;

@Entity
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String song;
    private String moTa;
    private String image;

    @ManyToOne
    @JoinColumn(name = "singer_id")
    private Singer singer;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Song() {
    }

    public Song(String name, String song, String moTa, String image, Category category, Singer singer) {
        this.name = name;
        this.song = song;
        this.moTa = moTa;
        this.image = image;
        this.category = category;
        this.singer = singer;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Song(Long id, String name, String song, String moTa, String image, Category category, Singer singer) {
        this.id = id;
        this.name = name;
        this.song = song;
        this.moTa = moTa;
        this.image = image;
        this.category = category;
        this.singer = singer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
