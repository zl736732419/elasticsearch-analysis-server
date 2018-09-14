package com.zheng.elasticsearch.plugins.service;

import java.util.List;

/**
 * stop word service
 * @Author zhenglian
 * @Date 2018/9/14
 */
public interface StopWordService {
    List<String> findAllStopWords();
}
