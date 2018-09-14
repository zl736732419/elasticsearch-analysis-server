package com.zheng.elasticsearch.plugins.mapper;

import com.zheng.elasticsearch.plugins.domain.HotWord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * hot word mapper
 * @Author zhenglian
 * @Date 2018/9/14
 */
@Mapper
public interface HotWordMapper {
    List<HotWord> list();
}
