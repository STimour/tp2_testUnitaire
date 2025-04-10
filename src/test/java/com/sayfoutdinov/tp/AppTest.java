package com.sayfoutdinov.tp;

// Ensure the Article class is correctly imported or update the path if necessary
import com.sayfoutdinov.tp.Article; // Update to the correct package path of the Article class
import com.sayfoutdinov.tp.ListArticle;
import java.util.List;
import java.util.ArrayList;

public class AppTest {
    /**
     * Create the test case
     *
     * @param testAddArticle name of the test case
     */
    @org.junit.jupiter.api.Test
    public void testAddArticle( String testName )
    {       
        //Arrange
       List<Article> articles;

        Article newArticle = new Article("Stylo", 2.2, articles.Count(articles) + 1);        
    
        //Act 
        articles.add(newArticle);

        //Assert
        assertEquals(1, articles.getArticleCount());
    }

    // /**
    // * @return the suite of tests being tested
    // */
    // @Test
    // public static Test suite()
    // {
    // return new TestSuite( AppTest.class );
    // }

    // /**
    // * Rigourous Test :-)
    // */
    // @Test
    // public void testApp()
    // {
    // assertTrue( true );
    // }
}
