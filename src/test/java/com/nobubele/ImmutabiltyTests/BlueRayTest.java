package com.nobubele.ImmutabiltyTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.nobubele.dvdrental.model.Inventory.Service.Impl.BlueRay;
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
public class BlueRayTest {
    
    public BlueRayTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void CreateTest()
     {
         BlueRay ray = new BlueRay.BlueRayType().id("12").blueR();
         Assert.assertEquals(ray.Price(61.5), 61.5, 62);
           Assert.assertEquals("12", ray.getId());
         
     }
    //  @Test
     public void UpdateTest()
     {
        //BlueRay ray = new BlueRay.BlueRayType().blueR();
       // Assert.assertNotEquals(ray.Price(.0) , 61.5 , 62);
         
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
