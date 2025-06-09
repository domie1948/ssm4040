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


import com.dao.RuzhixinxiDao;
import com.entity.RuzhixinxiEntity;
import com.service.RuzhixinxiService;
import com.entity.vo.RuzhixinxiVO;
import com.entity.view.RuzhixinxiView;

@Service("ruzhixinxiService")
public class RuzhixinxiServiceImpl extends ServiceImpl<RuzhixinxiDao, RuzhixinxiEntity> implements RuzhixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuzhixinxiEntity> page = this.selectPage(
                new Query<RuzhixinxiEntity>(params).getPage(),
                new EntityWrapper<RuzhixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuzhixinxiEntity> wrapper) {
		  Page<RuzhixinxiView> page =new Query<RuzhixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuzhixinxiVO> selectListVO(Wrapper<RuzhixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuzhixinxiVO selectVO(Wrapper<RuzhixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuzhixinxiView> selectListView(Wrapper<RuzhixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuzhixinxiView selectView(Wrapper<RuzhixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
