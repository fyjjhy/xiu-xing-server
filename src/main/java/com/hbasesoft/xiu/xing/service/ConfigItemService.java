package com.hbasesoft.xiu.xing.service;

import com.hbasesoft.xiu.xing.entity.ConfigItemEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2020年05月30日 <br>
 * @see com.hbasesoft.xiu.xing.service <br>
 * @since V1.0 <br>
 */
public interface ConfigItemService {

    @Transactional(readOnly = true)
    List<ConfigItemEntity> queryConfItems(String funcId);

    /**
     * Description: 查询配置项<br>
     *
     * @author 付永杰<br>
     * @taskId <br>
     * @param funcCode
     * @param configCode
     * @return <br>
     */
    @Transactional(readOnly = true)
    String getConfigItem(String funcCode, String configCode);

}
