package com.hbasesoft.xiu.xing.service;

import com.hbasesoft.xiu.xing.entity.ZhenFaEntity;
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
public interface ZhenFaService {

    /**
     * Description: 查询阵法列表总数<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param
     * @return <br>
     */
    @Transactional(readOnly = true)
    int getZhenFaCount();

    /**
     * Description: 获取阵法信息<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param zhenFaId
     * @return <br>
     */
    @Transactional(readOnly = true)
    ZhenFaEntity getZhenFaById(String zhenFaId);

    /**
     * Description: 保存或修改阵法信息<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param entity
     * @return <br>
     */
    @Transactional(rollbackFor = Throwable.class)
    void updateZhenFa(ZhenFaEntity entity);

}
