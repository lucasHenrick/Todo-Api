package com.henrick.todo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrick.todo.domain.Todo;
import com.henrick.todo.repositorys.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todorepository;

	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring boot 2 e Angular 11",
				formatter.parse("25/03/2022"), false);
		Todo t2 = new Todo(null, "Trabalhar", "Estudar Spring boot 2 e Angular 11",
				formatter.parse("25/03/2022"), true);
		Todo t3 = new Todo(null, "Malhar", "Estudar Spring boot 2 e Angular 11",
				formatter.parse("25/03/2022"), false);
		Todo t4 = new Todo(null, "Beber água", "Estudar Spring boot 2 e Angular 11",
				formatter.parse("25/03/2022"), true);

		todorepository.saveAll(Arrays.asList(t1,t2,t3,t4));

	}
}
