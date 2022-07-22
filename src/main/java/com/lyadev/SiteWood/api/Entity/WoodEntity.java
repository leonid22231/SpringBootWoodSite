package com.lyadev.SiteWood.api.Entity;

import javax.persistence.*;

@Entity
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
    private float Thickness;

    @Column(name = "long")
    private float _Long;

    @Column(name = "width")
    private float Width;

    @Column(name = "sort")
    private String Sort;

    @Column(name = "form")
    private String Form;

    @Column(name = "price")
    private int Price;

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

    public float getThickness() {
        return Thickness;
    }

    public void setThickness(float thickness) {
        Thickness = thickness;
    }

    public float get_Long() {
        return _Long;
    }

    public void set_Long(float _Long) {
        this._Long = _Long;
    }

    public float getWidth() {
        return Width;
    }

    public void setWidth(float width) {
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
