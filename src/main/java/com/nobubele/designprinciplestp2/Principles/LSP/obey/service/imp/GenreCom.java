/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.LSP.obey.service.imp;

import com.nobubele.designprinciplestp2.Principles.LSP.obey.service.MovieGenreInterface;

/**
 *
 * @author nobu
 */
public class GenreCom implements MovieGenreInterface
{
   
        String name = "Leon Schuster your country needs you";
        String duration = "100:00";
        String type = "Comedy";
       
    @Override
    public String genre() 
    {
        
        
        String myObject =(name+duration+type);
         
        return myObject;
    }
    
    @Override
     public boolean Type()
     {
         return true;
     }   
    
}