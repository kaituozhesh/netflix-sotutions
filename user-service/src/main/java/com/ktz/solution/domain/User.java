package com.ktz.solution.domain;

import lombok.Data;

/**
 * @ClassName User
 * @Description
 * @Author kaituozhesh
 * @Date 2020/4/2 8:37
 * @Version V1.0.0
 **/
@Data
public class User {
    private Long id;
    private String username;
    private String password;
}
