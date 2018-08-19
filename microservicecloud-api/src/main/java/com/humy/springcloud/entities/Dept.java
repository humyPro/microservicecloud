package com.humy.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author humy
 * @date 2018/8/15 - 21:25
 */

@NoArgsConstructor
@Data
@Accessors(chain = true)
@SuppressWarnings("serial")
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;//来自哪一个数据库，因为微服务架构可以一个服务队友一个数据库，同一个信息被存储到不同数据库。

    public Dept(String dname) {
        this.dname = dname;
    }
}
