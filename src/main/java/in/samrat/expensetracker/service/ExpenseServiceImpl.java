package in.samrat.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.samrat.expensetracker.model.Expense;
import in.samrat.expensetracker.repository.ExpenseRepository;


@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
		
		return expenseRepository.findAll();
	}

}
