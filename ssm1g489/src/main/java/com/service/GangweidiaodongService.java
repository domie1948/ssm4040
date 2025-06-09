package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GangweidiaodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GangweidiaodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GangweidiaodongView;


/**
 * 岗位调动
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public interface GangweidiaodongService extends IService<GangweidiaodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GangweidiaodongVO> selectListVO(Wrapper<GangweidiaodongEntity> wrapper);
   	
   	GangweidiaodongVO selectVO(@Param("ew") Wrapper<GangweidiaodongEntity> wrapper);
   	
   	List<GangweidiaodongView> selectListView(Wrapper<GangweidiaodongEntity> wrapper);
   	
   	GangweidiaodongView selectView(@Param("ew") Wrapper<GangweidiaodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GangweidiaodongEntity> wrapper);
   	
}

