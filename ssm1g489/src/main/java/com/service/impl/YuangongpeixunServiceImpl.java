package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuangongpeixunDao;
import com.entity.YuangongpeixunEntity;
import com.service.YuangongpeixunService;
import com.entity.vo.YuangongpeixunVO;
import com.entity.view.YuangongpeixunView;

@Service("yuangongpeixunService")
public class YuangongpeixunServiceImpl extends ServiceImpl<YuangongpeixunDao, YuangongpeixunEntity> implements YuangongpeixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongpeixunEntity> page = this.selectPage(
                new Query<YuangongpeixunEntity>(params).getPage(),
                new EntityWrapper<YuangongpeixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongpeixunEntity> wrapper) {
		  Page<YuangongpeixunView> page =new Query<YuangongpeixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongpeixunVO> selectListVO(Wrapper<YuangongpeixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongpeixunVO selectVO(Wrapper<YuangongpeixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongpeixunView> selectListView(Wrapper<YuangongpeixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongpeixunView selectView(Wrapper<YuangongpeixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
