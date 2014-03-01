/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.polymorphism.Service.Imp;

import com.nobubele.designprinciplestp2.Principles.LSP.violation.service.MovieInterface;
import com.nobubele.designprinciplestp2.polymorphism.Service.MoviesInter;

/**
 *
 * @author nobu
 */
public class DVDMovie implements MoviesInter
{

    @Override
    public boolean name() 
    {
        String name = "Rush Hour";
        if(name == "Rush Hour")
       return true;
        else
            return false;
        
    }

    @Override
    public int duration() 
    {
        int time = 60;
       return time;
    }
    
}
