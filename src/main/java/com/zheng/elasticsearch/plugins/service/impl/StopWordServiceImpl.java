package com.zheng.elasticsearch.plugins.service.impl;

import com.zheng.elasticsearch.plugins.domain.StopWord;
import com.zheng.elasticsearch.plugins.mapper.StopWordMapper;
import com.zheng.elasticsearch.plugins.service.StopWordService;
import com.zheng.elasticsearch.plugins.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * stop word service impl
 * @Author zhenglian
 * @Date 2018/9/14
 */
@Service
public class StopWordServiceImpl implements StopWordService {
    @Autowired
    private StopWordMapper mapper;
    @Override
    public List<String> findAllStopWords() {
        List<StopWord> stopWords = mapper.list();
        if (StringUtils.isEmpty(stopWords)) {
            return new ArrayList<>();
        }
        return stopWords.stream()
                .filter(word -> StringUtils.isNotEmpty(word))
                .map(StopWord::getStopWord)
                .collect(Collectors.toList());
    }
}
