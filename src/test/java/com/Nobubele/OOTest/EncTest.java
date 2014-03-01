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
import com.nobubele.designprinciplestp2.Ecaupslation.Moviee;
import com.nobubele.designprinciplestp2.Principles.ISP.violation.Service.Imp.Movies;
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
public class EncTest 
{
     public static Moviee tot;
    public static ApplicationContext ctx;
    
    public EncTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestEnc()
     {
       Assert.assertNull(tot.getType(), "its null");
     }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(TestConfig.class);
         tot =(Moviee)ctx.getBean("TestEnc");
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
