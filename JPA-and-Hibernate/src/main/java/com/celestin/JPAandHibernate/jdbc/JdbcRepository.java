package com.celestin.JPAandHibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepository {
    @Autowired
    private JdbcTemplate springjdbcTemplate;
    private static String INSERT_QUERY01 =
            """
            insert into course(id,name,author)
            values(1,'learn spring','mark');
            """;

    private static String INSERT_QUERY02 =
            """
            insert into course(id,name,author)
            values(?,?,?);
            """;

    private static String DELETE_QUERY =
            """
            delete from course
            where id=?
            """;

    private static String SELECT_QUERY =
            """
                    select * from course
                    where id=?
                    """;

    public void insert01() {
        springjdbcTemplate.update(INSERT_QUERY01);
    }

    public void insert02(Course course) {
        springjdbcTemplate.update(INSERT_QUERY02,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteByID(long id) {
        springjdbcTemplate.update(DELETE_QUERY,id);
    }

    public Course findById(long id) {
        return springjdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class),id);  // BeanPropertyRowMapper will map the result into a bean with specified class
    }
}
