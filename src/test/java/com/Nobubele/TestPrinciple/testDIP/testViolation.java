/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Nobubele.TestPrinciple.testDIP;

import com.nobubele.designprinciplestp2.Config.TestConfig;
import com.nobubele.designprinciplestp2.Principles.DIP.violation.TaxQua;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class testViolation 
{
    public static TaxQua tot;
    public static ApplicationContext ctx;
    
    public testViolation() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testVio()
     {
         Assert.assertNotEquals(tot.total(), 500.01, 500);
     }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        ctx = new AnnotationConfigApplicationContext(TestConfig.class);
         tot =(TaxQua)ctx.getBean("VioDIP");
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
