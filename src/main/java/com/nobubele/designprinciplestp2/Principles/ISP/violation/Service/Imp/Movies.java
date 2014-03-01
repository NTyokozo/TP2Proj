/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.ISP.violation.Service.Imp;

import com.nobubele.designprinciplestp2.Principles.ISP.violation.Service.MovieTypeSerInterface;

/**
 *
 * @author nobu
 */
public class Movies
{
    MovieTypeSerInterface movie;
    
    public void setMovie(MovieTypeSerInterface movies)
    {
        movie = movies;
    }
    public void movie()
    {
        movie.time();
    }
    
}
