package com.hbasesoft.xiu.xing.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2020年06月27日 <br>
 * @see com.hbasesoft.xiu.xing.service <br>
 * @since V1.0 <br>
 */
public interface XiuXingRiZhiService {

    /**
     * Description: 获取修行日志数量<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param cangKuId
     * @return <br>
     */
    @Transactional(readOnly = true)
    int getXiuXingRiZhiCount(String cangKuId);

}
