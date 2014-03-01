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
public class Hours
{
    
    public static Minutes min;
   
    public int getHours()
    {
        int hr = min.getMinutes() / 60;
        return hr;
    }
  
}
