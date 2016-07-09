/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.enquiryproject.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Deepika
 */
public interface GenericDAO<T> {
     List<T> getAll() throws ClassNotFoundException,SQLException;
   int insert(T t) throws ClassNotFoundException,SQLException;
   T getById(int id) throws ClassNotFoundException,SQLException;
}
