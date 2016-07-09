/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.enquiryproject.constant;

/**
 *
 * @author Deepika
 */
public class SQLConstant {
    public static final String COURSE_GETALL="SELECT * FROM" + TableConstant.COURSE_TABLE;
    public static final String COURSE_GETBYID="SELECT * FROM" + TableConstant.COURSE_TABLE + "WHERE course_id=?";
    
    
     public static final String ENQUIRY_INSERT="INSERT INTO" + TableConstant.ENQUIRY_TABLE + "(first_name,last_name,email,contact_no,course,timing,message) VALUES(? ? ? ? ? ? ?)";

}


