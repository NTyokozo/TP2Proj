/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.dvdrental.model.Menu;

import com.nobubele.dvdrental.model.movies.Service.MoviesInterface;
import java.util.Objects;

/**
 *
 * @author nobu
 */
public final class AddMovie implements MoviesInterface 
{
     private String id;
     private String movieName;


     private AddMovie()
     {
     }
      public AddMovie(Builder builder)
      {
          id = builder.id;
          movieName = builder.movieName; 
      }
      public static class Builder
      {
          private String id;
          private String movieName;
          
          public Builder()
          {
              this.id = id;
              this.movieName = movieName;
              
          }

        public Builder(String movieName)
        {
            this.movieName = movieName;
        }

       
          
          public Builder id(String value)
          {
              id= value;
              return this;
          }
          public Builder MovieName(String value)
          {
              movieName = value;
              return this;
          }
          public AddMovie build()
          {
              return new AddMovie(this);
          }
      }

    public String getMovieName() {
        return movieName;
    }
      
    public String getId() {
        return id;
    }

   
   @Override
    public String pg()
   { return "";
   }
   

    @Override
    public String type() {
        return "";
    }
      @Override
    public int hashCode() {
        int hash = 5;
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
        final AddMovie other = (AddMovie) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
