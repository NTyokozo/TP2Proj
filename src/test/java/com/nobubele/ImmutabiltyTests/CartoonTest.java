/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.movies.Service.Impl.Cartoons;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
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
public class CartoonTest {
    
    public CartoonTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
   public void CreatTest()
   {
      Cartoons car = new Cartoons.CartoonsBuilder().id("20").com();
     /// List<String> namess = new ArrayList<String>();
       // namess.add("Air Bander");
       // namess.add("Dragon Balls");
      ListIterator list = car.namess().listIterator();
      Assert.assertEquals("Air Bander" , list.next());
      Assert.assertEquals(car.getId(), "20");
   }
   @Test
   public void UpdateTest()
   {
       Cartoons car = new Cartoons.CartoonsBuilder().id("21").com();
      ListIterator list = car.namess().listIterator();
         Assert.assertNotEquals("Dragon Balls" , list.next());
      Assert.assertEquals(car.getId(), "21");
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
