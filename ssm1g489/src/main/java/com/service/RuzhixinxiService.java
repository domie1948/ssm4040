package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuzhixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuzhixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuzhixinxiView;


/**
 * 入职信息
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public interface RuzhixinxiService extends IService<RuzhixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuzhixinxiVO> selectListVO(Wrapper<RuzhixinxiEntity> wrapper);
   	
   	RuzhixinxiVO selectVO(@Param("ew") Wrapper<RuzhixinxiEntity> wrapper);
   	
   	List<RuzhixinxiView> selectListView(Wrapper<RuzhixinxiEntity> wrapper);
   	
   	RuzhixinxiView selectView(@Param("ew") Wrapper<RuzhixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuzhixinxiEntity> wrapper);
   	
}

