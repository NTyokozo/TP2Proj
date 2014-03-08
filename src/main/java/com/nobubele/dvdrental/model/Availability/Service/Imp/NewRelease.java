/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.dvdrental.model.Availability.Service.Imp;

import com.nobubele.dvdrental.model.Availability.AvailableInterface;

/**
 *
 * @author nobu
 */
public final class NewRelease implements AvailableInterface
{
   
    private final String id;
    
    
    public NewRelease(NewReleaseBuilder bui)
    {
        id = bui.id;
    }
    public static class NewReleaseBuilder
    {
        private String id;
        
        public NewReleaseBuilder()
        {
         
        }
        public NewReleaseBuilder id(String value)
        {
            id = value;
            return (this);
            
        }
        public NewRelease newR()
        {
            return new NewRelease(this);
        }
        
    }
    public boolean avail(boolean avail)
    {
        avail = true;
        return avail;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final NewRelease other = (NewRelease) obj;
        return !((this.id == null) ? (other.id != null) : !this.id.equals(other.id));
    }
    
}
