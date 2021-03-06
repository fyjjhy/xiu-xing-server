package com.hbasesoft.xiu.xing.service.impl;

import com.hbasesoft.xiu.xing.constant.XiuXingCommonConstant;
import com.hbasesoft.xiu.xing.dao.AddressDao;
import com.hbasesoft.xiu.xing.entity.AddressEntity;
import com.hbasesoft.xiu.xing.service.AddressService;
import org.apache.commons.lang3.StringUtils;
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
 * @CreateDate 2020年06月29日 <br>
 * @see com.hbasesoft.xiu.xing.service.impl <br>
 * @since V1.0 <br>
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressDao addressDao;

    @Override
    public int getAddressCount() {
        return addressDao.getAddressCount();
    }

    @Override
    public List<AddressEntity> queryAddressListByAddrType(String addrType) {
        DetachedCriteria criteria = DetachedCriteria.forClass(AddressEntity.class);
        if (StringUtils.isNotEmpty(addrType)) {
            criteria.add(Restrictions.ne(XiuXingCommonConstant.ADDR_TYPE, addrType));
        }
        return addressDao.getListByCriteriaQuery(criteria);
    }

    @Override
    public AddressEntity getAddress(String addrId) {
        return addressDao.get(AddressEntity.class, addrId);
    }
}
