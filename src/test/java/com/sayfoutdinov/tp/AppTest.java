package com.sayfoutdinov.tp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    private ListArticle listArticle;

    @BeforeEach
    public void setUp() {
        // Initialize ListArticle and ensure the CSV file is empty before each test
        listArticle = new ListArticle();
        File file = new File("articles.csv");
        if (file.exists()) {
            file.delete(); // Delete the file to start fresh
        }
    }

    @Test
    public void testAddArticle() {
        // Arrange
        Article newArticle = new Article(1, "Stylo", "Un stylo bleu");

        // Act
        String result = listArticle.addArticle(newArticle);

        // Assert
        assertEquals("Article added successfully.", result);
        assertEquals(1, listArticle.Count());
    }
}
