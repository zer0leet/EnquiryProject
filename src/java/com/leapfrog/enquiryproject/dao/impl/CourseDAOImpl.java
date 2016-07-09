/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.enquiryproject.dao.impl;

import com.leapfrog.enquiryproject.constant.SQLConstant;
import com.leapfrog.enquiryproject.dao.CourseDAO;
import com.leapfrog.enquiryproject.entity.Course;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Deepika
 */
public class CourseDAOImpl implements CourseDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    
    @Override
    public List<Course> getAll() throws ClassNotFoundException, SQLException {
        return jdbcTemplate.query(SQLConstant.COURSE_GETALL, new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
                Course c=new Course();
                c.setId(rs.getInt("course_id"));
                c.setName(rs.getString("course_name"));
                c.setDescription(rs.getString("course_description"));
                c.setAddedDate(rs.getDate("added_date"));
                c.setModifiedDate(rs.getDate("modified_date"));
                c.setSortOrder(rs.getInt("sort_order"));
                c.setStatus(rs.getBoolean("Status"));
                
                return c;
            }
        });
    }

    @Override
    public int insert(Course t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Course getById(int id) throws ClassNotFoundException, SQLException {
        return jdbcTemplate.queryForObject(SQLConstant.COURSE_GETBYID, new Object[]{id}, new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
                Course c=new Course();
                c.setId(rs.getInt("course_id"));
                c.setName(rs.getString("course_name"));
                c.setDescription(rs.getString("course_description"));
                c.setAddedDate(rs.getDate("added_date"));
                c.setModifiedDate(rs.getDate("modified_date"));
                c.setSortOrder(rs.getInt("sort_order"));
                c.setStatus(rs.getBoolean("Status"));
                
                return c;
            }
        });
    }
    
}
