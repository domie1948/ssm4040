package com.entity.view;

import com.entity.RenshiguanliyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 人事管理员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
@TableName("renshiguanliyuan")
public class RenshiguanliyuanView  extends RenshiguanliyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenshiguanliyuanView(){
	}
 
 	public RenshiguanliyuanView(RenshiguanliyuanEntity renshiguanliyuanEntity){
 	try {
			BeanUtils.copyProperties(this, renshiguanliyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
