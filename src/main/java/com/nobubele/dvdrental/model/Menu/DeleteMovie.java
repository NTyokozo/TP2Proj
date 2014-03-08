/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.dvdrental.model.Menu;

/**
 *
 * @author nobu
 */
public final class DeleteMovie 
{
     private String id;  
     private String message;
     
     public DeleteMovie(Delete del)
     {
         id = del.id;
         message = del.message;
         
     }
     
     public static class Delete
     {
         private String id;
         private String message;
         
         public Delete(String message)
         {
             this.message = message;
         }
         public Delete id(String value)
         {
             id = value;
             return this;
         }
         public Delete message(String value)
         {
             message = value;
             return this;
         }
         public DeleteMovie delete()
         {
             return new DeleteMovie (this);
         }
     }
    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
     
     

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final DeleteMovie other = (DeleteMovie) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
     
    
}
