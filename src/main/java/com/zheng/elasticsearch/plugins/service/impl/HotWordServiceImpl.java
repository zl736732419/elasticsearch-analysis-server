package com.zheng.elasticsearch.plugins.service.impl;

import com.zheng.elasticsearch.plugins.domain.HotWord;
import com.zheng.elasticsearch.plugins.mapper.HotWordMapper;
import com.zheng.elasticsearch.plugins.service.HotWordService;
import com.zheng.elasticsearch.plugins.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * hot word service impl
 * @Author zhenglian
 * @Date 2018/9/14
 */
@Service
public class HotWordServiceImpl implements HotWordService {
    @Autowired
    private HotWordMapper mapper;
    @Override
    public List<String> findAllHotWords() {
        List<HotWord> hotWords = mapper.list();
        if (StringUtils.isEmpty(hotWords)) {
            return new ArrayList<>();
        }
        return hotWords.stream()
                .filter(word -> StringUtils.isNotEmpty(word))
                .map(HotWord::getHotWord)
                .collect(Collectors.toList());
    }
}
