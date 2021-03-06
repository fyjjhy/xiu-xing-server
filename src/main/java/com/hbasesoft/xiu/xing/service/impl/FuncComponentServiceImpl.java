package com.hbasesoft.xiu.xing.service.impl;

import com.hbasesoft.xiu.xing.constant.XiuXingCommonConstant;
import com.hbasesoft.xiu.xing.dao.FuncComponentDao;
import com.hbasesoft.xiu.xing.entity.FuncComponentEntity;
import com.hbasesoft.xiu.xing.service.FuncComponentService;
import org.hibernate.criterion.DetachedCriteria;
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
public class FuncComponentServiceImpl implements FuncComponentService {

    @Resource
    private FuncComponentDao funcComponentDao;

    @Override
    public List<FuncComponentEntity> queryFunctionComponent(String funcId) {
        DetachedCriteria criteria = DetachedCriteria.forClass(FuncComponentEntity.class);
        criteria.add(Restrictions.eq(XiuXingCommonConstant.FUNC_ID, funcId));
        return funcComponentDao.getListByCriteriaQuery(criteria);
    }
}
