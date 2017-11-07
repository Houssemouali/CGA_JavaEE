package tn.esprit.cga.services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.cga.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
