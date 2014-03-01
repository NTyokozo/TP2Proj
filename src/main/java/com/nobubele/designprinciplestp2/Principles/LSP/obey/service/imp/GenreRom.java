/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.LSP.obey.service.imp;

import com.nobubele.designprinciplestp2.Principles.LSP.obey.service.Movie;
import com.nobubele.designprinciplestp2.Principles.LSP.obey.service.MovieGenreInterface;

/**
 *
 * @author nobu
 */
public class GenreRom implements Movie
{
   

    @Override
    public boolean Type() {
       
        return true;
    }
    
    
}
