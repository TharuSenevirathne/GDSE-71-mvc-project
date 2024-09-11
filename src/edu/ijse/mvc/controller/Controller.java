/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.model.model;
import edu.ijse.mvc.dto.Dto;
import java.util.List;
/**
 *
 * @author tharu
 */
public class Controller {
    private model model = new model();
    
    public String save (Dto Dto) throws Exception {
    String resp = model.save(Dto);
    return resp;
    }
    
    public String update (Dto Dto) throws Exception {
    String resp = model.update(Dto);
    return resp;
    }
    
    public String delete (String Id) throws Exception {
    String resp = model.delete(Id);
    return resp;
    }
    
    public Dto search (String Id) throws Exception {
    Dto dto = model.search(Id);
    return dto;
    }
    public List< Dto > getAll () throws Exception {
    List< Dto > Dtos = model.getAll();
    return Dtos;
    }
  
}
