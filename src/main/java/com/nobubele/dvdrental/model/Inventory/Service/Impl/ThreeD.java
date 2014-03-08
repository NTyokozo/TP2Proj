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
public class ThreeD implements InventoryInterface
{
    private final String id;
    private final boolean status ;
    private final double tax = 0.14;

    public String getId() {
        return id;
    }


    private ThreeD(ThreeDType type)
    {
        id = type.id;
        status = type.status;
    }
    public static class ThreeDType
    {
        private String id ;
        private boolean status ;
        
        public ThreeDType(boolean status)
        {
            this.status = status;
        }
        public ThreeDType id(String value)
        {
           id = value;
            return this;
            
        }
        public ThreeDType status(boolean value)
        {
            status = value;
            return this;
        }
        public ThreeD threed()
        {
            return new ThreeD(this);
        }
    }

    public int length()
    {
        return 60;
    }
    

      public double Price(double fulTotal)
    {
        double total = 50;
      
        double amount = total * tax;
        
         fulTotal = amount + total;
        
        return fulTotal;
        
    } 

    public boolean isStatus() {
        return status;
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
        final ThreeD other = (ThreeD) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    
}
