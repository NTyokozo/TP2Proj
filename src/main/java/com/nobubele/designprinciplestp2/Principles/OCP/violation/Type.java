/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.OCP.violation;

/**
 *
 * @author nobu
 */
public class Type 
{
    int stock ;
    String type = "";
    
    public String typeOfCD()
    {
        
        if(stock == 1)
               type = ("Romentic");
        else if (stock ==2)
            type = ("Comedy");
        else if (stock == 3)
               type = ("Action");
        
        return type;
    
    }
    
    public String typeOfDVD()
    {
         if(stock == 1)
               type = ("War");
        else if (stock ==2)
            type = ("Drama");
        else if (stock == 3)
               type = ("Action");
        
        return type;
    }
    

    
}
