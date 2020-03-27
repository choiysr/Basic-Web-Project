package com.dreamer.loading;

import static org.junit.Assert.fail;

import lombok.extern.log4j.Log4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;

@Log4j
public class DBConnectionTests extends LoadingTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void connectTest() {
        try (Connection conn = dataSource.getConnection()) {
            log.info(conn);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void myBatisTest() {
        try (SqlSession session = sqlSessionFactory.openSession();
             Connection conn = session.getConnection();) {
            log.info(session);
            log.info(conn);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
