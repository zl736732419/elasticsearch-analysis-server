package com.zheng.elasticsearch.plugins.service;

import java.util.List;

/**
 * hot word service
 * @Author zhenglian
 * @Date 2018/9/14
 */
public interface HotWordService {
    List<String> findAllHotWords();
}
