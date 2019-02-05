package com.maersk.line.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.maersk.line");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        String query ="insert into emp_tbl values(?,?,?)";
		jdbcTemplate.update(query, 2,"Anil",10000d);
        ((AbstractApplicationContext)context).close();
    }
}
