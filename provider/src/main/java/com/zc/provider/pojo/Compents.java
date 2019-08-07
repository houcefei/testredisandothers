/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LandInfo
 * Author:   Administrator
 * Date:     2019/7/29 17:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zc.provider.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Lookup;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/7/29
 * @since 1.0.0
 */
@Data
public class Compents implements Serializable {
    private long id;
    private String landId;
    private Date createDate;

}



