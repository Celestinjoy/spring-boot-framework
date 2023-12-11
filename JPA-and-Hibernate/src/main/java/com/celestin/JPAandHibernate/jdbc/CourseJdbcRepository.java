package com.celestin.JPAandHibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springjdbcTemplate;
    private String INSERT_QUERY01 =
            """
            insert into course(id,name,author)
            values(1,'learn spring','mark');        
            """;

    private String INSERT_QUERY02 =
            """
            insert into course(id,name,author)
            values(?,?,?);        
            """;

    private String DELETE_QUERY =
            """
            delete from course 
            where id=?     
            """;

    public void insert01() {
        springjdbcTemplate.update(INSERT_QUERY01);
    }

    public void insert02(Course course) {
        springjdbcTemplate.update(INSERT_QUERY02,course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(long id) {
        springjdbcTemplate.update(DELETE_QUERY,id);
    }
}
