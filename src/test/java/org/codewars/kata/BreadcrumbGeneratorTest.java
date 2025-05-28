package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreadcrumbGeneratorTest {
    @Test
    public void examplesTests() {
        String[] urls = new String[] {"mysite.com/pictures/holidays.html",
                "www.codewars.com/users/GiacomoSorbi?ref=CodeWars",
                "www.microsoft.com/docs/index.htm#top",
                "mysite.com/very-long-url-to-make-a-silly-yet-meaningful-example/example.asp",
                "www.very-long-site_name-to-make-a-silly-yet-meaningful-example.com/users/giacomo-sorbi",
                "https://www.linkedin.com/in/giacomosorbi"};

        String[] seps = new String[] {" : ", " / ", " * ", " > ", " + ", " * "};

        String[] anss = new String[] {"<a href=\"/\">HOME</a> : <a href=\"/pictures/\">PICTURES</a> : <span class=\"active\">HOLIDAYS</span>",
                "<a href=\"/\">HOME</a> / <a href=\"/users/\">USERS</a> / <span class=\"active\">GIACOMOSORBI</span>",
                "<a href=\"/\">HOME</a> * <span class=\"active\">DOCS</span>",
                "<a href=\"/\">HOME</a> > <a href=\"/very-long-url-to-make-a-silly-yet-meaningful-example/\">VLUMSYME</a> > <span class=\"active\">EXAMPLE</span>",
                "<a href=\"/\">HOME</a> + <a href=\"/users/\">USERS</a> + <span class=\"active\">GIACOMO SORBI</span>",
                "<a href=\"/\">HOME</a> * <a href=\"/in/\">IN</a> * <span class=\"active\">GIACOMOSORBI</span>"};

        for (int i = 0 ; i < urls.length ; i++) {
            System.out.println(" \nTest with : " + urls[i]);
            String actual = BreadcrumbGenerator.generate_bc(urls[i], seps[i]);
            if (!actual.equals(anss[i])) {
                System.out.printf("Expected : %s%n", reformat(anss[i]));
                System.out.printf("Actual :   %s%n", reformat(actual));
            }
            assertEquals(anss[i], actual);
        }
    }
    String reformat(String s) { return s; }

}