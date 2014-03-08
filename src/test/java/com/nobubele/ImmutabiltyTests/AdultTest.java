/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.Customer.Service.Impl.Adult;
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
public class AdultTest {
    
    public AdultTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
  @Test
    public void CreateTest()
    {
        Adult ad = new Adult.AdultBuilder().id("04").adul();
         String[] custInfo = {"Nobubele", "0747444826 ", "235 Bric Str","011"};
        Assert.assertNotEquals(ad.infor(), custInfo);
        Assert.assertEquals(ad.getId(), "04");
    }
    @Test
    public void UpDateTest()
    {
        
        Adult ad = new Adult.AdultBuilder().id("05").adul();
         String[] custInfo = {"Nobubele", "0747444826 ", "235BricStr"};
        Assert.assertNotEquals(ad.infor(), custInfo);
        Assert.assertEquals(ad.getId(), "05");
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
