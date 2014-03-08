package com.nobubele.ImmutabiltyTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.nobubele.dvdrental.model.Inventory.Service.Impl.Dvd;
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
public class DvdTest {
    
    public DvdTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void CreateTest() 
    {
        Dvd dvd = new Dvd.DvdType().id("12").dvd();
        Assert.assertEquals(dvd.Price(57.1), 57.1, 57);
          Assert.assertEquals("12", dvd.getId());
    }
    @Test
    public void updateTest() 
    {
        
        Dvd dvd = new Dvd.DvdType().id("122").dvd();
        Assert.assertFalse(dvd.status());
        Assert.assertEquals("122", dvd.getId());
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
