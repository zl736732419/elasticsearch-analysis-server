package com.zheng.elasticsearch.plugins.mapper;

import com.zheng.elasticsearch.plugins.domain.StopWord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * stop word mapper
 * @Author zhenglian
 * @Date 2018/9/14
 */
@Mapper
public interface StopWordMapper {
    List<StopWord> list();
}
