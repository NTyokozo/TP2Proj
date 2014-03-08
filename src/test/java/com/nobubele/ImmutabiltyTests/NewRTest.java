/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.Availability.Service.Imp.NewRelease;
import org.testng.Assert;
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
public class NewRTest {
    
    public NewRTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void CreateTest()
     {
         NewRelease newR = new NewRelease.NewReleaseBuilder().id("04").newR();
         Assert.assertTrue(newR.avail(true), "The test is true");
         Assert.assertEquals(newR.getId(), "04");
     }
    @Test
     public void UpdateTest()
     {
         NewRelease newR = new NewRelease.NewReleaseBuilder().id("08").newR();
         Assert.assertTrue(newR.avail(true), "The test is true");
         Assert.assertEquals(newR.getId(), "08");
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
