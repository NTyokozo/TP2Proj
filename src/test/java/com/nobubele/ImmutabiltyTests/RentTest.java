/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.Menu.RentMovie;
import org.springframework.util.Assert;
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
public class RentTest {
    
    public RentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void CreateTest() 
    {
        RentMovie rents = new RentMovie.RentMovieBuilder().id("25").rent();
        Assert.hasText(rents.type(), "Has Text Available");
        Assert.hasLength(rents.getId(), "Length");
    }
    @Test void UpdateTest()
    {
        
        RentMovie rents = new RentMovie.RentMovieBuilder().id("38").rent();
        Assert.hasText(rents.pg(), "Has Text Available");
        Assert.hasLength(rents.getId(), "Length");
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
