/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.EduAndGame.service.Impl.PsPGame;
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
public class PspGameTest {
    
    public PspGameTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createTest()
    {
        PsPGame game = new PsPGame.PsPGameBuilder().speed(200).id("25").psp();
        Assert.assertEquals(200, game.getSpeed());
        Assert.assertEquals("25", game.getId());
     }
      @Test
    public void updateTest() 
    {
         PsPGame game = new PsPGame.PsPGameBuilder().speed(130).id("30").psp();
        Assert.assertEquals(130, game.getSpeed());
        Assert.assertEquals("30", game.getId());
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
