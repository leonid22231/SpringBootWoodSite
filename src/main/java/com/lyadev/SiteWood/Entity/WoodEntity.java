package com.lyadev.SiteWood.Entity;

import javax.persistence.*;

@Entity(name = "wood")
@Table(name = "wood")
public class WoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="wood_id")
    private Long id;

    @Column(name = "name")
    private String Name;

    @Column(name = "image")
    private String Image;

    @Column(name = "thickness")
    private Long Thickness;

    @Column(name = "longi")
    private Long longi;

    @Column(name = "width")
    private Long Width;

    @Column(name = "sort")
    private String Sort;

    @Column(name = "form")
    private String Form;

    @Column(name = "price")
    private int Price;

    public WoodEntity(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Long getThickness() {
        return Thickness;
    }

    public void setThickness(Long thickness) {
        Thickness = thickness;
    }

    public Long getLongi() {
        return longi;
    }

    public void setLongi(Long longi) {
        this.longi = longi;
    }

    public Long getWidth() {
        return Width;
    }

    public void setWidth(Long width) {
        Width = width;
    }

    public String getSort() {
        return Sort;
    }

    public void setSort(String sort) {
        Sort = sort;
    }

    public String getForm() {
        return Form;
    }

    public void setForm(String form) {
        Form = form;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
