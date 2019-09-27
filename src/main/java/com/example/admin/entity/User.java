package com.example.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author generator
 * @since 2019-09-27
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String account;
    /**
     * 姓名
     */
	private String name;
    /**
     * 生日
     */
	private LocalDate birthday;
    /**
     * 密码
     */
	private String password;


}
