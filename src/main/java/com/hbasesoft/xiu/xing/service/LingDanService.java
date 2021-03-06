package com.hbasesoft.xiu.xing.service;

import com.hbasesoft.xiu.xing.entity.LingDanEntity;
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
public interface LingDanService {

    /**
     * Description: 查询灵丹列表总数<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    @Transactional(readOnly = true)
    int getLingDanCount();

    /**
     * Description: 获取灵丹信息<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param lingDanId
     * @return <br>
     */
    @Transactional(readOnly = true)
    LingDanEntity getLingDanById(String lingDanId);

    /**
     * Description: 更新灵丹信息<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param lingDanEntity
     * @return <br>
     */
    @Transactional(rollbackFor = Throwable.class)
    void updateLingDan(LingDanEntity lingDanEntity);

}
