package com.nobubele.ImmutabiltyTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.nobubele.dvdrental.model.Menu.AddMovie;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nobu
 */
public class AddMovieTest {
    
    public AddMovieTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testCreation()
     {
         AddMovie add = new AddMovie.Builder("Movie Added").id("10").build();
         Assert.assertEquals(add.getMovieName(), "Movie Added");
         Assert.assertEquals(add.getId(), "10");
     }
     @Test
     public void testUpdate ()
     {
         AddMovie add = new AddMovie.Builder("Movie not added").id("12").build();
          Assert.assertNotSame(add.getMovieName(), "Movie Added");
         Assert.assertNotSame(add.getId(), "125");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
