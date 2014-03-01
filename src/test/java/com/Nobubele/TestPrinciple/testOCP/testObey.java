/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Nobubele.TestPrinciple.testOCP;

import com.nobubele.designprinciplestp2.Config.TestConfig;
import com.nobubele.designprinciplestp2.Principles.OCP.obey.Service.TypeServiceInterface;
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
public class testObey 
{
    public static TypeServiceInterface moviet;
    public static ApplicationContext ctx;
    
    public testObey() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void TestOCP() 
    {
        Assert.assertNotNull(moviet.typeOfDvd());
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
         ctx = new AnnotationConfigApplicationContext(TestConfig.class);
         moviet =(TypeServiceInterface)ctx.getBean("TestOCP");
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
