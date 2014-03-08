/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.dvdrental.model.EduAndGame.service.Impl;

import com.nobubele.dvdrental.model.EduAndGame.TypeInterface;
import com.nobubele.dvdrental.model.EduAndGame.TypeInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nobu
 */
public final class Physics implements TypeInterface{

    private final String id;
    private final double TAX_Amount = 0.14;
    
    private Physics(PhysicsBuilder sics)
    {
        id = sics.id;
    }

   
    public static class PhysicsBuilder
    {
        private String id;
        
        public PhysicsBuilder()
        {
            
        }
        public PhysicsBuilder id(String value)
        {
            id = value;
            return this;
        }
        public Physics phy()
        {
            return new Physics(this);
        }
    }
    public int quantity()
    {
        int num = 1;
        
        if(num ==1)
          System.out.println("Stock available");
        
       return num;
    }

    public double price(double total)
    {
        double amount = 60 * TAX_Amount;
         total = amount + 60;
        
        return total ;
    }

    public List<String> name() 
    {
        List<String> names = new ArrayList<String>();
        names.add("Golf Mania");
        names.add("Jack Pots");
        
        return names;
        
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Physics other = (Physics) obj;
        return !((this.id == null) ? (other.id != null) : !this.id.equals(other.id));
    }
    
}
