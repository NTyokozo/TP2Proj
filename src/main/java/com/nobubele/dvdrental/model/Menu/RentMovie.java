/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.dvdrental.model.Menu;

import com.nobubele.dvdrental.model.Inventory.InventoryInterface;
import com.nobubele.dvdrental.model.movies.Service.MoviesInterface;


/**
 *
 * @author nobu
 */
public final class RentMovie implements InventoryInterface, MoviesInterface
{
    private String id;
  
    private RentMovie(RentMovieBuilder build)
    {
        id = build.id;
    }
    public static class RentMovieBuilder
    {
        private String id;
        
        public RentMovieBuilder()
        {
           
        }
        public RentMovieBuilder id(String value)
        {
          id = value;
          return this;
        }
        public RentMovie rent()
        {
          return new RentMovie(this);    
        }
    }
    public int length() {
        return 60;
    }

    public boolean status() {
       return true;
    }

    public double Price(double total) {
        return 120;
    }

    public String type() {
       return "Romance";
    }

    public String pg()
    {
      return "18";
    
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final RentMovie other = (RentMovie) obj;
        return !((this.id == null) ? (other.id != null) : !this.id.equals(other.id));
    }
  
    
    
}
