package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongpeixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongpeixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongpeixunView;


/**
 * 员工培训
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public interface YuangongpeixunService extends IService<YuangongpeixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongpeixunVO> selectListVO(Wrapper<YuangongpeixunEntity> wrapper);
   	
   	YuangongpeixunVO selectVO(@Param("ew") Wrapper<YuangongpeixunEntity> wrapper);
   	
   	List<YuangongpeixunView> selectListView(Wrapper<YuangongpeixunEntity> wrapper);
   	
   	YuangongpeixunView selectView(@Param("ew") Wrapper<YuangongpeixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongpeixunEntity> wrapper);
   	
}

