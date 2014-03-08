/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.Customer.Service.Impl.Teen;
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
public class TeenTest {
    
    public TeenTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void CreateTest()
    {
        Teen ad = new Teen.TeenBuilder().age(16).id("05").ten();
         Assert.assertEquals(ad.getAge(), 16);
         Assert.assertEquals(ad.getId(), "05");
    }
    @Test
    public void Update()
    {
        Teen ad = new Teen.TeenBuilder().age(18).id("06").ten();
         Assert.assertSame(ad.getAge(), 18);
         Assert.assertEquals(ad.getId(), "06");
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
