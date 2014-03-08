/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.dvdrental.model.Availability.Service.Imp;

/**
 *
 * @author nobu
 */
public final class RentalAgreement 
{
    private final String id;
    private final int timer;
    
    private RentalAgreement(RentalBuilds build)
    {
        id = build.id;
        timer = build.timer;
    }
    public static class RentalBuilds
    {
        private String id;
        private int timer;
        
        public RentalBuilds()
        {
        }
        public RentalBuilds id(String value)
        {
            id = value;
            return this;
        }
        public RentalBuilds timer(int value )
        {
            timer = value;
            return this;
        }
        public RentalAgreement rent()
        {
            return new RentalAgreement(this);
        }
        
    }

    public String getId() {
        return id;
    }

    public int getTimer() {
        return timer;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final RentalAgreement other = (RentalAgreement) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
