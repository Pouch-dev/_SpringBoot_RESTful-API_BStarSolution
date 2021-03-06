package com.example.demo.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CategoryDAO;
import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;

@Service
public class CategoryImplement implements CategoryService{
	
	@Autowired
	CategoryDAO cateDAO;

	@Override
	public <S extends Category> S save(S entity) {
		return cateDAO.save(entity);
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return cateDAO.findAll(pageable);
	}

	@Override
	public List<Category> findAll() {
		return cateDAO.findAll();
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return cateDAO.findAll(sort);
	}

	@Override
	public Category findById(Integer id) {
		return cateDAO.findById(id).get();
	}

	@Override
	public void deleteById(Integer id) {
		cateDAO.deleteById(id);
	}

	@Override
	public void delete(Category entity) {
		cateDAO.delete(entity);
	}

	@Override
	public Category getById(Integer id) {
		return cateDAO.getById(id);
	}

	@Override
	public Category create(Category category) {
		return cateDAO.save(category);
	}

	@Override
	public Category update(Category category) {
		return cateDAO.save(category);
	}

	@Override
	public void delete(Integer id) {
		cateDAO.deleteById(id);
	}

	
}
