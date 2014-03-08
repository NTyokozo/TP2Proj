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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nobu
 */
public class Maths implements TypeInterface {
    
    private final String id;
    private final double TAX_Amount = 0.16;
    
    private Maths(MathsBuilder math)
    {
        id = math.id;
    }

   
    public static class MathsBuilder
    {
        private String id;
        
        public MathsBuilder()
        {
            
        }
        public MathsBuilder id(String value)
        {
            id = value;
            return this;
        }
        public Maths maths()
        {
            return new Maths(this);
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
        names.add("Maths1");
        names.add("Geometry");
        
        return names;
        
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Maths other = (Maths) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

    
}
