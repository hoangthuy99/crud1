package com.ra.service;

import com.ra.model.dao.CategoryDAO;
import com.ra.model.dao.CategoryDaoImpl;
import com.ra.model.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDAO categoryDao;

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public Category findById(Integer id) {
        return categoryDao.findById(id);
    }

    @Override
    public Boolean saveOrUpdate(Category category) {
        return categoryDao.saveOrUpdate(category);
    }

    @Override
    public void delete(Integer id) {
        categoryDao.delete(id);
    }
}
