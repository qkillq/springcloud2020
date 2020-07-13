package com.atguigu.springcloud.alibaba.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment implements Serializable {
    private long id;
    private String serial;
}
