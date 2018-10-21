package tn.esprit.pi.epione.services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.pi.epione.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
