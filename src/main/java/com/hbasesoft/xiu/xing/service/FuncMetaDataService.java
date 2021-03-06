package com.hbasesoft.xiu.xing.service;

import com.hbasesoft.xiu.xing.entity.MetaModelEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2020年05月29日 <br>
 * @see com.hbasesoft.xiu.xing.service <br>
 * @since V1.0 <br>
 */
public interface FuncMetaDataService {

    @Transactional(readOnly = true)
    List<MetaModelEntity> queryMetaModelByFuncId(String funcId);

}
