/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Principles.PLK.violation;

/**
 *
 * @author nobu
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nobu
 */
public class minutes extends Seconds
    
{
   
    public int getMinutes()
    {
        int min = getUnitsPerSec() / 60;
       
        return min;
    }
   
}

