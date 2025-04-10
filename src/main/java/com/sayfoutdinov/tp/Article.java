package com.sayfoutdinov.tp;

public class Article {
    private int id;
    private String title;
    private String content;

    public Article(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public String toCsv() {
        return id + "," + title + "," + content;
    }

    public static Article fromCsv(String csvLine) {
        String[] fields = csvLine.split(",");
        return new Article(Integer.parseInt(fields[0]), fields[1], fields[2]);
    }

}
