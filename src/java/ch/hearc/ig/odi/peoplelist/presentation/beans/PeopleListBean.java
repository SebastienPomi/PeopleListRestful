/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.beans;

import ch.hearc.ig.odi.peoplelist.business.Person;
import ch.hearc.ig.odi.peoplelist.service.Services;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author sebastie.pomi
 */
@Named(value = "peopleListBean")
@RequestScoped
public class PeopleListBean {
    
    @Inject Services services;
    /**
     * Creates a new instance of PeopleListBean
     */
    public PeopleListBean() {
        
    }
    
    public List getPeopleList(){
        
        return services.getPeopleList();
    }
    
}
