/*
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
public class PsPGame implements TypeInterface
{
    private final String id;
    private final int speed;
    private final double Tax_Amount = 0.16;
   
    private PsPGame(PsPGameBuilder build)
    {
        id = build.id;
        speed = build.speed;
    }
    public static class PsPGameBuilder 
    {
        private String id;
        private int speed;
        
        public PsPGameBuilder()
        {
            
        }
        public PsPGameBuilder id(String value)
        {
            id = value;
            return this;   
        }
        public PsPGameBuilder speed(int value)
        {
            speed = value;
            return this;   
        }
        public PsPGame psp()
        {
            return new PsPGame(this);
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
        double amount = 120 * Tax_Amount;
         total = amount + 120;
        
        return total ;
    }

    public List<String> name() 
    {
        List<String> names = new ArrayList<String>();
        names.add("Quatum Physics");
        names.add("Applied Physics");
        
        return names;
        
    }

    public String getId() {
        return id;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final PsPGame other = (PsPGame) obj;
        return !((this.id == null) ? (other.id != null) : !this.id.equals(other.id));
    }
    
    
}
