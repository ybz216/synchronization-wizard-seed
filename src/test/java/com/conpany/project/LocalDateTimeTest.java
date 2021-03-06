/**
 * Copyright (C), 2018-2020, 998电商集团
 * FileName: RabbitMqTest
 * Author:   yushi
 * Date:     2019/6/17 15:45
 * Description: mq的测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.conpany.project;

import com.jzt.sync.model.QueueEnum;
import com.jzt.sync.mq.provide.MessageProvider;
import com.jzt.sync.service.impl.Sender;
import com.jzt.sync.util.LocalDateTimeUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 〈〈LocalDateTime的例子〉
 *
 * @author yushi
 * @create 2019/6/17
 * @since 1.0.0
 */
public class LocalDateTimeTest extends Tester {
    @Autowired
    private LocalDateTimeUtil localDateTimeUtil;

    @Test
    public void LocalDateTimeTest() throws Exception {
        localDateTimeUtil.getLocalDate();
    }

}