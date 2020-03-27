package com.dreamer.mapper;

import com.dreamer.loading.LoadingTests;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j
public class TimeMapperTests extends LoadingTests {

    @Setter(onMethod_ = {@Autowired})
    private TimeMapper timeMapper;

    @Test
    public void oracleTimeMapperAnnoTest() {
        log.info("Current Time is......");
        log.info(timeMapper.getTimeOracle());
    }

}
