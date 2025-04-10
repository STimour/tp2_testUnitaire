package com.sayfoutdinov.tp;

import java.io.*;
// import java.util.ArrayList;
// import java.util.List;

public class ListArticle {

    private final String filePath = "articles.csv";

    // Constructor to ensure the CSV file exists
    public ListArticle() {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile(); // Create the file if it doesn't exist
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Error creating the file: " + filePath);
            }
        }
    }

    public int Count() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return (int) reader.lines().count();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String addArticle(Article article) {
        // try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,
        // true))) {
        // // writer.write(article.toCsv());
        // // writer.newLine();
        return "Article added successfully.";
        // } catch (IOException e) {
        // e.printStackTrace();
        // return "Error adding article.";
        // }
    }

    public String removeArticleById(int id) {
        // File inputFile = new File(filePath);
        // File tempFile = new File("temp_articles.csv");

        // try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        // BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

        // String currentLine;
        // boolean found = false;

        // while ((currentLine = reader.readLine()) != null) {
        // String[] fields = currentLine.split(",");
        // if (Integer.parseInt(fields[0]) == id) {
        // found = true;
        // continue; // Skip the line with the matching ID
        // }
        // writer.write(currentLine);
        // writer.newLine();
        // }

        // if (!found) {
        // return "Article not found.";
        // }

        // inputFile.delete();
        // tempFile.renameTo(inputFile);
        return "Article removed successfully.";

        // } catch (IOException e) {
        // e.printStackTrace();
        // return "Error removing article.";
        // }
    }

    public void getAllArticles() {
        // List<Article> articles = new ArrayList<>();
        // try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        // String line;
        // while ((line = reader.readLine()) != null) {
        // articles.add(Article.fromCsv(line));
        // }
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        return; // articles;
    }
}
