/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
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
public final class Horror implements MoviesInterface
{
     private  String id;
    
    public Horror(HorrorBuilder hor)
    {
        id = hor.id;
    }
    
    public static class HorrorBuilder 
    {
        private String id;
        
        public HorrorBuilder()
        {
        }
        public HorrorBuilder id(String value)
        {
           this.id = value;
           return this;
        }
        public Horror horr()
        {
            return new Horror(this);
        }
    }
    
  
    public List<String> namess()
    {
        List<String> namess = new ArrayList<String>();
        namess.add("Sinister");
        namess.add("Conjuring");
        
                return namess;
    }
    public String type()
    {
        String type = "Funny Horror";
        
        return type;
    }
    public String pg()
    {
        String pg = "18 Years";
        
       return pg;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Horror other = (Horror) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

   
    

  
      
    
}
