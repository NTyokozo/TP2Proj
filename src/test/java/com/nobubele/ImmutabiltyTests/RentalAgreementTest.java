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

import com.nobubele.dvdrental.model.Availability.Service.Imp.RentalAgreement;
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
public class RentalAgreementTest {
    
    public RentalAgreementTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test(timeOut = 5)
     public void CreateTest() 
     {
         RentalAgreement ren = new RentalAgreement.RentalBuilds().id("02").rent();
        Assert.assertNotNull(ren.getTimer());
        Assert.assertNotNull(ren.getId());
     }
     @Test(timeOut = 6)
     public void UpdateTest()
     {
          RentalAgreement ren = new RentalAgreement.RentalBuilds().id("07").rent();
        Assert.assertNotNull(ren.getTimer());
        Assert.assertNotNull(ren.getId());
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
