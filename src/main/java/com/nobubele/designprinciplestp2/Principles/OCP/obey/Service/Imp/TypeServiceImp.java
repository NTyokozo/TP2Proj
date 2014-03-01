/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.OCP.obey.Service.Imp;

import com.nobubele.designprinciplestp2.Principles.OCP.obey.Service.TypeServiceInterface;



/**
 *
 * @author nobu
 */
public class TypeServiceImp implements TypeServiceInterface {

     int stock ;
    String type = "";
    
    @Override
    public String typeOfCD()
    {
        
        if(stock == 1)
               type = ("Romentic");
        else if (stock ==2)
            type = ("Comedy");
        else  
               type = ("Action");
        
        return type;
    
    }
      @Override
    public String typeOfDvd()
    {
         if(stock == 1)
               type = ("War");
        else if (stock ==2)
            type = ("Drama");
        else 
               type = ("Action");
        
        return type;
    }
 
}
