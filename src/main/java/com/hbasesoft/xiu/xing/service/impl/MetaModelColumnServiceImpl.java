package com.hbasesoft.xiu.xing.service.impl;

import com.hbasesoft.xiu.xing.constant.XiuXingCommonConstant;
import com.hbasesoft.xiu.xing.constant.XiuXingStatusCodeDef;
import com.hbasesoft.xiu.xing.dao.MetaModelColumnDao;
import com.hbasesoft.xiu.xing.entity.MetaModelColumnEntity;
import com.hbasesoft.xiu.xing.service.MetaModelColumnService;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2020年05月30日 <br>
 * @see com.hbasesoft.xiu.xing.service.impl <br>
 * @since V1.0 <br>
 */
@Service
public class MetaModelColumnServiceImpl implements MetaModelColumnService {

    @Resource
    private MetaModelColumnDao metaModelColumnDao;

    @Override
    public List<MetaModelColumnEntity> queryMetaModelColumnByModelId(String metaModelId) {
        DetachedCriteria criteria = DetachedCriteria.forClass(MetaModelColumnEntity.class);
        criteria.add(Restrictions.ne(XiuXingCommonConstant.STATE, XiuXingStatusCodeDef.DISABLE));
        criteria.add(Restrictions.eq(XiuXingCommonConstant.MODEL_ID, metaModelId));
        criteria.addOrder(Order.asc(XiuXingCommonConstant.SEQ));
        return metaModelColumnDao.getListByCriteriaQuery(criteria);
    }
}
