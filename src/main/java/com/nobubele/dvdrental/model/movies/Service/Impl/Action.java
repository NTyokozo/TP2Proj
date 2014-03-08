/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.dvdrental.model.movies.Service.Impl;

import com.nobubele.dvdrental.model.movies.Service.MoviesInterface;


/**
 *
 * @author nobu
 */
public final class Action implements MoviesInterface
{

     private final String id;
    
    private Action(ActionBuilder act)
    {
        id = act.id;
    }
    
    public static class ActionBuilder 
    {
        private String id;
        
        public ActionBuilder()
        {
        }
        public ActionBuilder id(String value)
        {
           this.id = value;
           return this;
        }
        public Action acts()
        {
            return new Action(this);
        }
    }
    
    public String name()
    {
        String name = "if only";
        String producer ="Gil Junger";
        String duration = "63:00";
        
        
        String myObject = (name + producer + duration);
        
        return myObject;
     
        
    }
   
    public String type()
    {
        String type = "action";
        
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
        hash = 73 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Action other = (Action) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
