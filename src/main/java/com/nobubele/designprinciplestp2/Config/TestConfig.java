/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobubele.designprinciplestp2.Config;



import com.nobubele.designprinciplestp2.Ecaupslation.Moviee;
import com.nobubele.designprinciplestp2.Inheritance.Comedy;
import com.nobubele.designprinciplestp2.Principles.DIP.obey.TotalInterface;
import com.nobubele.designprinciplestp2.Principles.DIP.obey.service.TotalImp;
import com.nobubele.designprinciplestp2.Principles.DIP.violation.TaxQua;
import com.nobubele.designprinciplestp2.Principles.ISP.obey.Service.Imp.Clock;
import com.nobubele.designprinciplestp2.Principles.ISP.obey.Service.Imp.RomMovie;
import com.nobubele.designprinciplestp2.Principles.ISP.obey.Service.MovieTypeSeriveInter;
import com.nobubele.designprinciplestp2.Principles.ISP.violation.Service.Imp.ComMovie;
import com.nobubele.designprinciplestp2.Principles.ISP.violation.Service.Imp.Movies;
import com.nobubele.designprinciplestp2.Principles.ISP.violation.Service.MovieTypeSerInterface;
import com.nobubele.designprinciplestp2.Principles.LSP.obey.service.MovieGenreInterface;
import com.nobubele.designprinciplestp2.Principles.LSP.obey.service.imp.GenreCom;
import com.nobubele.designprinciplestp2.Principles.OCP.obey.Service.Imp.TypeCDIMp;
import com.nobubele.designprinciplestp2.Principles.OCP.obey.Service.TypeServiceInterface;
import com.nobubele.designprinciplestp2.Principles.PLK.obey.service.Hours;
import com.nobubele.designprinciplestp2.Principles.SRP.obey.service.Imp.RomMoviez;
import com.nobubele.designprinciplestp2.polymorphism.Service.Imp.DVDMovie;
import com.nobubele.designprinciplestp2.polymorphism.Service.MoviesInter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author nobu
 */
@Configuration 
public class TestConfig
{
    @Bean(name = "TestEnc")
    public Moviee getType()
    {
        return new Moviee() ;
    }
     @Bean(name = "TestIher")
    public Comedy getTax()
    {
        return new Comedy();
    }
    
    @Bean(name = "TestPoly")
    public MoviesInter name()
    {
        return new DVDMovie();
    }
    @Bean (name = "TestDIP")
    public TotalInterface amount()
    {
        return new TotalImp();
    }
    @Bean (name = "TestISP")
    public MovieTypeSeriveInter times()
    {
        return new Clock();
    }
    @Bean (name = "TestLSP")
    public MovieGenreInterface genre()
    {
        return new GenreCom();
    }
     @Bean (name = "TestOCP")
    public TypeServiceInterface typeOfCD()
    {
        return new TypeCDIMp();
    }
     @Bean (name = "TestPLK")
    public Hours getHours()
    {
        return new Hours();
    }
     @Bean (name = "TestSRP")
    public RomMoviez totalPrice()
    {
        return new RomMoviez();
    }
    @Bean (name = "VioDIP")
    public TaxQua total()
    {
        return new TaxQua();
    }
    
     @Bean (name = "VioISP")
    public MovieTypeSerInterface time()
    {
        return new ComMovie();
    }
    
           
}
