/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Nobubele.TestPrinciple.testPLK;

import com.nobubele.designprinciplestp2.Config.TestConfig;
import com.nobubele.designprinciplestp2.Principles.PLK.obey.service.Hours;
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
public class testObey {
    
     public static Hours moviet;
    public static ApplicationContext ctx;
    
    public testObey() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestPLK() 
     {
         //Assert.assertEquals(moviet.getHours(),5, "Check Seconds");
     }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
         ctx = new AnnotationConfigApplicationContext(TestConfig.class);
         moviet =(Hours)ctx.getBean("TestPLK");
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
