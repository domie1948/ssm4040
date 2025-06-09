package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzidanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzidanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzidanView;


/**
 * 工资单
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public interface GongzidanService extends IService<GongzidanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzidanVO> selectListVO(Wrapper<GongzidanEntity> wrapper);
   	
   	GongzidanVO selectVO(@Param("ew") Wrapper<GongzidanEntity> wrapper);
   	
   	List<GongzidanView> selectListView(Wrapper<GongzidanEntity> wrapper);
   	
   	GongzidanView selectView(@Param("ew") Wrapper<GongzidanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzidanEntity> wrapper);
   	
}

