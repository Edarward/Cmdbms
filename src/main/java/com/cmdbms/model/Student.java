package com.cmdbms.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @ApiModelProperty(value="id")
    private Integer id;
    @ApiModelProperty(value="学生姓名" ,required=true)
    private String name;

    private String sex;

}
