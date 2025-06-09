package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiaoxiushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiaoxiushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiaoxiushenqingView;


/**
 * 调休申请
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public interface DiaoxiushenqingService extends IService<DiaoxiushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiaoxiushenqingVO> selectListVO(Wrapper<DiaoxiushenqingEntity> wrapper);
   	
   	DiaoxiushenqingVO selectVO(@Param("ew") Wrapper<DiaoxiushenqingEntity> wrapper);
   	
   	List<DiaoxiushenqingView> selectListView(Wrapper<DiaoxiushenqingEntity> wrapper);
   	
   	DiaoxiushenqingView selectView(@Param("ew") Wrapper<DiaoxiushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiaoxiushenqingEntity> wrapper);
   	
}

