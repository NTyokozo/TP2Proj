/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.EduAndGame.service.Impl.NintendoGame;
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
public class NintendoGameTest {
    
    public NintendoGameTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void createTest()
    {
        NintendoGame game = new NintendoGame.NintendoGameBuilder().speed('f').id("25").nin();
          PsPGame games = new PsPGame.PsPGameBuilder().id("25").psp();
       Assert.assertEquals('f', game.getSpeed());
       Assert.assertSame("they are the same", game.getId(), games.getId());
     }
      @Test
    public void updateTest() 
    {
         NintendoGame game = new NintendoGame.NintendoGameBuilder().speed('g').id("50").nin();
        Assert.assertEquals('g', game.getSpeed());
          PsPGame games = new PsPGame.PsPGameBuilder().id("25").psp();
        Assert.assertNotSame("they are the same", game.getId(), games.getId());
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
