package com.sayfoutdinov.tp;


/**
 * Article!
 *
 */
public class Article {
    private int Id;

    private float Price;

    private String Name;

    public Article(String Name, double Price, int Id) {
        this.Id = Id;
        this.Name = Name;
        this.Price = (float) Price;
    }
}
