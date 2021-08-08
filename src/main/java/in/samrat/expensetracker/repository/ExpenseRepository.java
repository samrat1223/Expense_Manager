package in.samrat.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.samrat.expensetracker.model.Expense;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
