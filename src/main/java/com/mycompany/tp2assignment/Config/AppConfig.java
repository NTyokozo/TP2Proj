/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.tp2assignment.Config;

import com.mycompany.tp2assignment.Service.StudImp;
import com.mycompany.tp2assignment.Service.StudInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author nobu
 */
@Configuration 
public class AppConfig 
{
    
    @Bean (name = "getPersonalDetails")
    
       public StudInterface getPersonalDetails()
       {
           return new StudImp();
       }
       
       @Bean (name ="classDay")
       
       public StudInterface classDay()
       {
           return new StudImp();
           
       }
       
       @Bean (name ="getFees")
       
       public StudInterface getFees()
       {
           return new StudImp();
       }
       
        @Bean (name ="grades")
        
       public StudInterface grades()
       {
           return new StudImp();
       }
       
       @Bean (name ="classDay1")
        
       public StudInterface classDay1()
       {
           return new StudImp();
       }
       @Bean (name = "Names")
       public StudInterface getName()
       {
           return new StudImp();
       }
        @Bean (name = "ingore")
       public StudInterface notImp()
       {
           return new StudImp();
       }
        @Bean (name = "gender")
       public StudInterface gender()
       {
           return new StudImp();
       }
       @Bean (name = "timeout")
       public StudInterface timeOuts()
       {
           return new StudImp();
       }

}
