/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.ImmutabiltyTests;

import com.nobubele.dvdrental.model.movies.Service.Impl.Romance;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
public class RomanceTest {
    
    public RomanceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void CreateTest() 
    {
        Romance rom = new Romance.RomanceBuilder().id("04").romm();
       List<String> name = new  ArrayList<String>();
       name.add("Rush Hour");
        name.add("Interns");
        name.add("Interns");
        
      Set<String> namess = new HashSet<String>(name);

        Assert.assertEquals(rom.namess(), namess);
        Assert.assertEquals(rom.getId(), "04");
    }
  @Test
    public void Updatetest()
    {
        Romance rom = new Romance.RomanceBuilder().id("05").romm();
       List<String> name = new  ArrayList<String>();
       name.add("Rush Hour");
        name.add("Interns");
        name.add("Intern");
        
      Set<String> namess = new HashSet<String>(name);

        Assert.assertNotEquals(rom.namess(), namess);
        Assert.assertEquals(rom.getId(), "05");
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
