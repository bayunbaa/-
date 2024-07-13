package com.sky.entity;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String name;

    private String password;

    private String phone;

    private String sex;

    @Getter
    @Setter
    private String idNumber;

    private Integer status;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")@Getter
    //    @Setter

    @Getter
    @Setter
    private LocalDateTime createTime;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Getter
    @Setter
    private LocalDateTime updateTime;
    @Getter
    @Setter
    private Long createUser;
    @Getter
    @Setter
    private Long updateUser;

}
