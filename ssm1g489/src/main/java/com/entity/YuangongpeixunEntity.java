package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 员工培训
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
@TableName("yuangongpeixun")
public class YuangongpeixunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangongpeixunEntity() {
		
	}
	
	public YuangongpeixunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shijian;
	
	/**
	 * 周期
	 */
					
	private String zhouqi;
	
	/**
	 * 讲师
	 */
					
	private String jiangshi;
	
	/**
	 * 课程
	 */
					
	private String kecheng;
	
	/**
	 * 教学反馈
	 */
					
	private String jiaoxuefankui;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：时间
	 */
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
	/**
	 * 设置：周期
	 */
	public void setZhouqi(String zhouqi) {
		this.zhouqi = zhouqi;
	}
	/**
	 * 获取：周期
	 */
	public String getZhouqi() {
		return zhouqi;
	}
	/**
	 * 设置：讲师
	 */
	public void setJiangshi(String jiangshi) {
		this.jiangshi = jiangshi;
	}
	/**
	 * 获取：讲师
	 */
	public String getJiangshi() {
		return jiangshi;
	}
	/**
	 * 设置：课程
	 */
	public void setKecheng(String kecheng) {
		this.kecheng = kecheng;
	}
	/**
	 * 获取：课程
	 */
	public String getKecheng() {
		return kecheng;
	}
	/**
	 * 设置：教学反馈
	 */
	public void setJiaoxuefankui(String jiaoxuefankui) {
		this.jiaoxuefankui = jiaoxuefankui;
	}
	/**
	 * 获取：教学反馈
	 */
	public String getJiaoxuefankui() {
		return jiaoxuefankui;
	}

}
