/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.ISP.obey.Service.Imp;

import com.nobubele.designprinciplestp2.Principles.ISP.obey.Service.MovieTimeServiceInt;
import com.nobubele.designprinciplestp2.Principles.ISP.obey.Service.MovieTypeSeriveInter;


/**
 *
 * @author nobu
 */
public class RomMovie implements MovieTimeServiceInt , MovieTypeSeriveInter
{
    @Override
     public int times()
    {
       
        int movie = 80;
        
        if(movie < 60)
            System.out.println("Please return disc");
        else if (movie > 120);
           System.out.println("Enjoy");
             
         return movie;  
    }
 @Override
    public String types() 
    {
        String title = "Soft Romance";
        int num = 1;
        if(num == 1)
            title = "Deep Romance";
        else if (num == 2)
              title = "Soft Romance";
        
        return title;
         }

}
