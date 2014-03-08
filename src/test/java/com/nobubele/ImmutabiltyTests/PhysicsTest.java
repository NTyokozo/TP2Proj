/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.EduAndGame.service.Impl.Physics;
import org.springframework.util.Assert;
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
public class PhysicsTest {
    
    public PhysicsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void CreateTest()
     {
         Physics phy = new Physics.PhysicsBuilder().id("10").phy();
         Assert.notEmpty(phy.name(), "NotEmpty");
         Assert.hasLength(phy.getId(), "10");
     }
     @Test
     public void UpdateTest()
     {
         Physics phy = new Physics.PhysicsBuilder().id("11").phy();
         Assert.notEmpty(phy.name(), "NotEmpty");
         Assert.hasLength(phy.getId(), "11");
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
