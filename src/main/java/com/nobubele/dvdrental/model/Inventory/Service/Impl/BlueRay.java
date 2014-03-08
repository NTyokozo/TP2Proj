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
public final class BlueRay implements InventoryInterface 
{
     private final String id;
    private final String status;
    private  final double tax = 0.23;
    
    public BlueRay(BlueRayType blue)
    {
        id = blue.id;
        status = blue.status;
    }

    public static class BlueRayType
    {
        private String id ;
        private String status ;
        
        public BlueRayType()
        {
        }
        public BlueRayType id(String value)
        {
           id = value;
            return this;
            
        }
        public BlueRayType status(String value)
        {
            status = value;
            return this;
        }
        public BlueRay blueR()
        {
            return new BlueRay(this);
        }
    }
    public int length()
    {
        return 120;
    }

    public boolean status()
    {
        if(status == "red")         
        return true;
        else 
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
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final BlueRay other = (BlueRay) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
