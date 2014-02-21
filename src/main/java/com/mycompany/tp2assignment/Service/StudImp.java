/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.tp2assignment.Service;

/**
 *
 * @author nobu
 */
public class StudImp implements StudInterface
{

    /**
     *
     * @return
     */
    @Override
    public String getName()
    {
        String name[] = {"Nobu" , "Sive" , "Itu" };
        
        return name[2];
    }
    @Override
    public String notImp()
    {
        String word = "IM CODING VERY HARD";
        
        return word;
    }
    @Override
    public String gender()
    {
      String  male = "";
        if("".equals(male)) 
            
            male = null;
        return male ;
        
        
        
    }
    
    @Override
        public void timeOuts()
    {
        System.out.println("Your Time has ran out");
    }
    
    @Override
    public String getPersonalDetails()
    {
        String name = "Ngqungqumbane";
        String surname = "Tyokozo";
        String studName = "211006181";
        
        String myObject =(name+surname+studName);
        
        return myObject;
       
    }

    @Override
    public boolean classDay() 
    {
        String slot = "";
        
        if(slot != null)
        return true;
        else 
        return false;
        
    }
    
    @Override
  public boolean classDay1()
 {
     String slot = "";
        
        if(slot != null)
        return false;
        else 
        return true;
 }
 
    @Override
    public int grades() 
    {
        int terms =4;
        int mark = 25;
        int total = mark * terms;
        
        
        return total;
    }
    
    @Override
    public float getFees()
    {
        float fees = (float) 100.00;
        float inter = (float) 0.8;
        
        return fees * inter + fees ;
        
    }
    
}
