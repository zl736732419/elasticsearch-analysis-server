package com.zheng.elasticsearch.plugins.action;

import com.zheng.elasticsearch.plugins.service.HotWordService;
import com.zheng.elasticsearch.plugins.service.StopWordService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * hot word action
 * @Author zhenglian
 * @Date 2018/9/14
 */
@RestController
@RequestMapping("/ext")
public class ExtWordAction {
    
    private Logger logger = LoggerFactory.getLogger(ExtWordAction.class);
    
    @Autowired
    private HotWordService hotWordService;
    @Autowired
    private StopWordService stopWordService;
    
    @RequestMapping(value = "/hotWord/load", method = RequestMethod.GET)
    @ResponseBody
    public String loadHotWord() {
        logger.info("load hot word... {}", System.currentTimeMillis());
        List<String> hotWords = hotWordService.findAllHotWords();
        return StringUtils.join(hotWords, "\n");
    }

    @RequestMapping(value = "/stopWord/load", method = RequestMethod.GET)
    @ResponseBody
    public String loadStopWord() {
        logger.info("load stop word... {}", System.currentTimeMillis());
        List<String> stopWords = stopWordService.findAllStopWords();
        return StringUtils.join(stopWords, "\n");
    }
}
