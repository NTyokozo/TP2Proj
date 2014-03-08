/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.EduAndGame.service.Impl.Maths;
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
public class MathTest {
    
    public MathTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
     public void Createtest()
     {
         Maths math = new Maths.MathsBuilder().id("20").maths();
         Assert.assertEquals(math.quantity(), 1);
         Assert.assertEquals(math.getId(), "20");
     }
     @Test
     public void UpdateTest()
     {
          Maths math = new Maths.MathsBuilder().id("30").maths();
         Assert.assertEquals(math.price(96.60), 96.60, 97);
         Assert.assertEquals(math.getId(), "30");
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
