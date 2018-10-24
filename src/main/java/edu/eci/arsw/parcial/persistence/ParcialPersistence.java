/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.persistence;

import java.io.IOException;

/**
 *
 * @author camilo
 */
public interface ParcialPersistence {

    /**
     *
     * @param shareName
     * @return
     * @throws java.io.IOException
     */
    public String getIntradayShare(String shareName) throws IOException;

    /**
     *
     * @param shareName
     * @return
     * @throws java.io.IOException
     */
    public String getDiaryShare(String shareName) throws IOException;

    /**
     *
     * @param shareName
     * @return
     * @throws java.io.IOException
     */
    public String getWeeklyShare(String shareName) throws IOException;

    /**
     *
     * @param shareName
     * @return
     * @throws java.io.IOException
     */
    public String getMonthlyShare(String shareName) throws IOException;
}
