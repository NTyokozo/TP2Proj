/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Ecaupslation;

/**
 *
 * @author nobu
 */
public class Moviee 
{
    private String name;
    private int time;
    private String type;

    public Moviee() {
    }

    public Moviee(String name, int time, String type) {
        this.name = name;
        this.time = time;
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setType(String type) {
        this.type = type;
    }
     
}
