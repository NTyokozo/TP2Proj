/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.dvdrental.model.Availability.Service.Imp;

import com.nobubele.dvdrental.model.Availability.AvailableInterface;
import com.nobubele.dvdrental.model.Availability.AvailableInterface;

/**
 *
 * @author nobu
 */
public class OldRelease implements AvailableInterface
{
    

   private final String id;
    
    
    public OldRelease(OldReleaseBuilder bui)
    {
        id = bui.id;
    }
    public static class OldReleaseBuilder
    {
        private String id;
        
        public OldReleaseBuilder()
        {
         
        }
        public OldReleaseBuilder id(String value)
        {
            id = value;
            return (this);
            
        }
        public OldRelease newO()
        {
            return new OldRelease(this);
        }
        
    }
    public boolean avail(boolean avail)
    {
        avail = false;
        return avail;
    }

    public String getId() {
        return id;
    }
}
