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
public final class Comedy implements MoviesInterface 
{   
    private final String id;
    
    public Comedy(ComedyBuilder comm)
    {
        id = comm.id;
    }
    
    public static class ComedyBuilder 
    {
        private String id;
        
        public ComedyBuilder()
        {
        }
        public ComedyBuilder id(String value)
        {
           this.id = value;
           return this;
        }
        public Comedy com()
        {
            return new Comedy(this);
        }
    }
    
    public String name()
    {
        String name = "Your Country needs you";
        String producer ="leon Schuster";
        String duration = "100:00";
        
        
        String myObject = (name + producer + duration);
        
        return myObject;
     
        
    }
           
    
    public String type()
    {
        String type = "romentic Comedy";
        
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
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Comedy other = (Comedy) obj;
        return !((this.id == null) ? (other.id != null) : !this.id.equals(other.id));
    }
    
    
}
