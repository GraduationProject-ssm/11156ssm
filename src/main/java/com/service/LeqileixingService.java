package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LeqileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LeqileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LeqileixingView;


/**
 * 乐器类型
 *
 * @author 
 * @email 
 * @date 2020-12-31 09:59:16
 */
public interface LeqileixingService extends IService<LeqileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LeqileixingVO> selectListVO(Wrapper<LeqileixingEntity> wrapper);
   	
   	LeqileixingVO selectVO(@Param("ew") Wrapper<LeqileixingEntity> wrapper);
   	
   	List<LeqileixingView> selectListView(Wrapper<LeqileixingEntity> wrapper);
   	
   	LeqileixingView selectView(@Param("ew") Wrapper<LeqileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LeqileixingEntity> wrapper);
   	
}

