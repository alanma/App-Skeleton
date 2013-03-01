package com.ama.apps.starter.services;

import java.util.Date;
import java.util.List;
import com.ama.apps.starter.model.Expense;
import com.ama.apps.starter.model.ExpenseType;
import com.ama.apps.starter.model.User;
public interface ExpenseService {
    Long createExpense(String description, ExpenseType expenseType, Date expenseDate,
               Double amount, User user);

    Expense getExpense(Long expenseId);

    List<Expense> getAllExpenses();

    List<Expense> getExpensesByUser(User user);

    List<Expense> getPendingExpensesList();

    List<Expense> getApprovedAndRejectedExpensesList();

    Expense changeExpenseStatus(Long expenseId, String state);

    void deleteExpense(Long expenseId);

    void updateExpense(Expense expense);
}
