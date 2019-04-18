package com.chen.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private int sid;
    private int sage;
    private String sname;
    private String sinfo;
    private String sphone;
}
