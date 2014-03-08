/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.dvdrental.model.movies.Service.Impl;

import com.nobubele.dvdrental.model.movies.Service.MoviesInterface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nobu
 */
public class Romance implements MoviesInterface
{
       private final String id;
    
    public Romance(RomanceBuilder rom)
    {
        id = rom.id;
    }
    
    public static class RomanceBuilder 
    {
        private String id;
        
        public RomanceBuilder()
        {
        }
        public RomanceBuilder id(String value)
        {
           this.id = value;
           return this;
        }
        public Romance romm()
        {
            return new Romance(this);
        }
    }
    
    public Set<String> namess()
    {
        List<String> name = new ArrayList<String>();
      //  Set<String> namess = new HashMap<String>();
        name.add("Rush Hour");
        name.add("Interns");
        name.add("Interns");
        
         
          Set<String> namess = new HashSet<String>(name);
                return namess;
    }
    public String type()
    {
        String type = "romentic";
        
        return type;
    }
    public String pg()
    {
        String pg = "16";
        
       return pg;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Romance other = (Romance) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
}
