package com.dreamer.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

    @Select("select sysdate from dual")
    public String getTimeOracle();

}
