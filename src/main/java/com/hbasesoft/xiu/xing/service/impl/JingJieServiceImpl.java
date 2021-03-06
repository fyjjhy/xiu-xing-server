package com.hbasesoft.xiu.xing.service.impl;

import com.hbasesoft.xiu.xing.dao.JingJieDao;
import com.hbasesoft.xiu.xing.entity.JingJieEntity;
import com.hbasesoft.xiu.xing.service.JingJieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2020年06月13日 <br>
 * @see com.hbasesoft.xiu.xing.service.impl <br>
 * @since V1.0 <br>
 */
@Service
public class JingJieServiceImpl implements JingJieService {

    @Resource
    private JingJieDao jingJieDao;

    @Override
    public int getJingJieCount() {
        return jingJieDao.getJingJieCount();
    }

    @Override
    public JingJieEntity getJingJieById(String jingJieId) {
        return jingJieDao.get(JingJieEntity.class, jingJieId);
    }
}
