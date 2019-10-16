package com.znsd.mall.service.impl;

import com.znsd.mall.entity.Category;
import com.znsd.mall.mapper.CategoryMapper;
import com.znsd.mall.service.ICategoryService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 类别 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2019-10-16
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
