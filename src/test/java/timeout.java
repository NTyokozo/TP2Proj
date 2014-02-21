/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.tp2assignment.Config.AppConfig;
import com.mycompany.tp2assignment.Service.StudInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nobu
 */
public class timeout {
      public static StudInterface stud;
    public static ApplicationContext ctx;
    
    public timeout() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test(timeOut=7)
     public void testTimeOut(){
         
          stud.timeOuts();
     }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         stud =(StudInterface)ctx.getBean("timeout");
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
