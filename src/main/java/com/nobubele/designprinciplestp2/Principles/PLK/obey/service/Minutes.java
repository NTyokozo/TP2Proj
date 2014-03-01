/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.PLK.obey.service;

/**
 *
 * @author nobu
 */
public class Minutes
{
    
    public static Seconds sec;
   
    public int getMinutes()
    {
        int min = sec.getUnitsPerSec() / 60;
       
        return min;
    }
   
}
