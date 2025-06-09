package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenshiguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenshiguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenshiguanliyuanView;


/**
 * 人事管理员
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public interface RenshiguanliyuanService extends IService<RenshiguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenshiguanliyuanVO> selectListVO(Wrapper<RenshiguanliyuanEntity> wrapper);
   	
   	RenshiguanliyuanVO selectVO(@Param("ew") Wrapper<RenshiguanliyuanEntity> wrapper);
   	
   	List<RenshiguanliyuanView> selectListView(Wrapper<RenshiguanliyuanEntity> wrapper);
   	
   	RenshiguanliyuanView selectView(@Param("ew") Wrapper<RenshiguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenshiguanliyuanEntity> wrapper);
   	
}

