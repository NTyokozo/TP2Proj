/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.movies.Service.Impl.Action;
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
public class ActionTest {
    
    public ActionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void CreateTest()
    {
        Action act = new Action.ActionBuilder().id("08").acts();
        String name = "if only";
        String producer ="Gil Junger";
        String duration = "63:00";
        
        
        String myObject = (name + producer + duration);
        
        Assert.assertEquals(act.name(), myObject);
        Assert.assertEquals(act.getId(), "08");
    }
    @Test
    public void UpdateTest()
    {
        Action act = new Action.ActionBuilder().id("09").acts();
        String name = "if Now";
        String producer ="Mary Mary";
        String duration = "64:00";
        
        
        String myObject = (name + producer + duration);
        
        Assert.assertNotEquals(act.name(), myObject);
        Assert.assertEquals(act.getId(), "09");
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
