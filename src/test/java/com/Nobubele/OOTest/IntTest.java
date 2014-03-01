/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Nobubele.OOTest;

import com.nobubele.designprinciplestp2.Config.TestConfig;
import com.nobubele.designprinciplestp2.Inheritance.Comedy;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class IntTest {
    public static Comedy tot;
    public static ApplicationContext ctx;
    
    public IntTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestInt()
     {
         Assert.assertEquals(tot.getPrice(), 200, 200.1);
     }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(TestConfig.class);
         tot =(Comedy)ctx.getBean("TestIher");
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
