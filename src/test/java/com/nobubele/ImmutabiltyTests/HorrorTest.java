/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.movies.Service.Impl.Horror;
import java.util.ArrayList;
import java.util.List;
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
public class HorrorTest {
    
    public HorrorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
   public void CreateTest()
   {
       Horror ho = new Horror.HorrorBuilder().id("01").horr();
       List<String> name = new  ArrayList<String>();
       name.add("Sinister");
       name.add("Conjuring");
       
       Assert.assertEquals(ho.namess(), name );
       Assert.assertEquals(ho.getId(), "01");
   }
   @Test
   public void UpdateTest()
   {
       Horror ho = new Horror.HorrorBuilder().id("02").horr();
       List<String> name = new  ArrayList<String>();
       name.add("Rush Hour");
       name.add("Interns");
       
       Assert.assertNotEquals(ho.namess(), name );
       Assert.assertEquals(ho.getId(), "02");
      ;
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
