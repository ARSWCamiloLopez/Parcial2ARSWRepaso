/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.controller;

import edu.eci.arsw.parcial.services.ParcialServices;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camilo
 */
@RestController
@RequestMapping(value = "/shares")
public class ParcialAPIController {
    
    @Autowired
    ParcialServices pServices;
    
    /**
     *
     * @param shareName
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, path = "/intraday/{shareName}")
    public ResponseEntity<?> getIntradayShare(@PathVariable("shareName") String shareName){
        try {
            return new ResponseEntity<>(pServices.getIntradayShare(shareName),
                    HttpStatus.ACCEPTED);
        } catch (IOException ex) {
            return new ResponseEntity<>("No se han podido obtener las acciones", HttpStatus.NOT_FOUND);
        }        
    }
    
    /**
     *
     * @param shareName
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, path = "/daily/{shareName}")
    public ResponseEntity<?> getDiaryShare(@PathVariable("shareName") String shareName){
        try {
            return new ResponseEntity<>(pServices.getDiaryShare(shareName),
                    HttpStatus.ACCEPTED);
        } catch (IOException ex) {
            return new ResponseEntity<>("No se han podido obtener las acciones", HttpStatus.NOT_FOUND);
        }        
    }

    /**
     *
     * @param shareName
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, path = "/weekly/{shareName}")
    public ResponseEntity<?> getWeeklyShare(@PathVariable("shareName") String shareName){
        try {
            return new ResponseEntity<>(pServices.getWeeklyShare(shareName),
                    HttpStatus.ACCEPTED);
        } catch (IOException ex) {
            return new ResponseEntity<>("No se han podido obtener las acciones", HttpStatus.NOT_FOUND);
        }        
    }

    /**
     *
     * @param shareName
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, path = "/monthly/{shareName}")
    public ResponseEntity<?> getMonthlyShare(@PathVariable("shareName") String shareName){
        try {
            return new ResponseEntity<>(pServices.getMonthlyShare(shareName),
                    HttpStatus.ACCEPTED);
        } catch (IOException ex) {
            return new ResponseEntity<>("No se han podido obtener las acciones", HttpStatus.NOT_FOUND);
        }        
    }    
}
