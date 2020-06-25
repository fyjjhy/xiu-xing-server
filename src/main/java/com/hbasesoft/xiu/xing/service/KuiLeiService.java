package com.hbasesoft.xiu.xing.service;

import com.hbasesoft.xiu.xing.entity.KuiLeiEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2020年06月13日 <br>
 * @see com.hbasesoft.xiu.xing.service <br>
 * @since V1.0 <br>
 */
public interface KuiLeiService {

    /**
     * Description: 查询傀儡列表总数<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    @Transactional(readOnly = true)
    int getKuiLeiCount();

    /**
     * Description: 获取傀儡信息<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param kuiLeiId
     * @return <br>
     */
    @Transactional(readOnly = true)
    KuiLeiEntity getKuiLeiById(String kuiLeiId);

}
