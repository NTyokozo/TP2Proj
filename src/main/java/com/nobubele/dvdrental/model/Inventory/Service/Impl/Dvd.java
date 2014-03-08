/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.dvdrental.model.Inventory.Service.Impl;

import com.nobubele.dvdrental.model.Inventory.InventoryInterface;
import com.nobubele.dvdrental.model.Inventory.InventoryInterface;

/**
 *
 * @author nobu
 */
public final class Dvd implements InventoryInterface
{
    private String id;
    private  final double tax = 0.14;
    
    public Dvd(DvdType dvd)
    {
        id = dvd.id;
    }

    public static class DvdType
    {
        private String id ;
        private boolean status ;
        
        public DvdType()
        {
        }
        public DvdType id(String value)
        {
           id = value;
            return this;
            
        }
        public DvdType status(boolean value)
        {
            status = value;
            return this;
        }
        public Dvd dvd()
        {
            return new Dvd(this);
        }
    }
    public int length()
    {
        return 60;
    }

    public boolean status()
    {
        return false;
    }

    public double Price(double fulTotal)
    {
        double total = 50;
        
        double amount = total * tax;
        
         fulTotal = amount + total;
        
        return fulTotal;
        
    } 

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Dvd other = (Dvd) obj;
        return !((this.id == null) ? (other.id != null) : !this.id.equals(other.id));
    }
    
    
    
}
