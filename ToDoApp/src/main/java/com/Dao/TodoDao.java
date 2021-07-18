package com.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.Entity.Todo;
@Component
public class TodoDao {
@Autowired
HibernateTemplate hibernateTemplate;
@Transactional
public int save(Todo t) {
	Integer i = (Integer) this.hibernateTemplate.save(t);
	return i;
}
public List<Todo> getAll(){
	List<Todo> todo = this.hibernateTemplate.loadAll(Todo.class);
	return todo;
}

}











