/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.movies.Service.Impl.Comedy;
import java.util.ArrayList;
import java.util.List;
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
public class ComedyTest {
    
    public ComedyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void CreateTest()
     {
         Comedy coms = new Comedy.ComedyBuilder().id("12").com();
        
       Assert.assertNotSame(coms.name(), "Your Country Needs you"+ "Leaon Schuster" + "60:00");
       Assert.assertEquals("12", coms.getId());
     }  
     @Test
     public void Updatetest()
     {
           Comedy coms = new Comedy.ComedyBuilder().id("13").com();
        
       Assert.assertNotSame(coms.name(), "Your County Needs you"+ "leon Schuster" + "100:00");
       Assert.assertEquals("13", coms.getId());
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
