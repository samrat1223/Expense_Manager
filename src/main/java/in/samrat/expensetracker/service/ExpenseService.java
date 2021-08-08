package in.samrat.expensetracker.service;

import java.util.List;

import in.samrat.expensetracker.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();
}
