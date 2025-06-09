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


import com.dao.RenshiguanliyuanDao;
import com.entity.RenshiguanliyuanEntity;
import com.service.RenshiguanliyuanService;
import com.entity.vo.RenshiguanliyuanVO;
import com.entity.view.RenshiguanliyuanView;

@Service("renshiguanliyuanService")
public class RenshiguanliyuanServiceImpl extends ServiceImpl<RenshiguanliyuanDao, RenshiguanliyuanEntity> implements RenshiguanliyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenshiguanliyuanEntity> page = this.selectPage(
                new Query<RenshiguanliyuanEntity>(params).getPage(),
                new EntityWrapper<RenshiguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenshiguanliyuanEntity> wrapper) {
		  Page<RenshiguanliyuanView> page =new Query<RenshiguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenshiguanliyuanVO> selectListVO(Wrapper<RenshiguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenshiguanliyuanVO selectVO(Wrapper<RenshiguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenshiguanliyuanView> selectListView(Wrapper<RenshiguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenshiguanliyuanView selectView(Wrapper<RenshiguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
