package com.entity.view;

import com.entity.RuzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 入职信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
@TableName("ruzhixinxi")
public class RuzhixinxiView  extends RuzhixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuzhixinxiView(){
	}
 
 	public RuzhixinxiView(RuzhixinxiEntity ruzhixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, ruzhixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
