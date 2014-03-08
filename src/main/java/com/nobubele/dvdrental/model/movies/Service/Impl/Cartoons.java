/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.dvdrental.model.movies.Service.Impl;

import com.nobubele.dvdrental.model.movies.Service.MoviesInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nobu
 */
public class Cartoons implements MoviesInterface
{
     private final String id;
    
    private Cartoons(CartoonsBuilder comm)
    {
        id = comm.id;
    }
    
    public static class CartoonsBuilder 
    {
        private String id;
        
        public CartoonsBuilder()
        {
        }
        public CartoonsBuilder id(String value)
        {
           this.id = value;
           return this;
        }
        public Cartoons com()
        {
            return new Cartoons(this);
        }
    }
    

    public List<String> namess()
    {
        List<String> namess = new ArrayList<String>();
        namess.add("Air Bander");
        namess.add("Dragon Balls");
        
                return namess;
    }
    public String type()
    {
        String type = "Action Catoons";
        
        return type;
    }
    public String pg()
    {
        String pg = "All";
        
       return pg;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cartoons other = (Cartoons) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
