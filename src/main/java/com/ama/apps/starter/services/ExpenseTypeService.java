package com.ama.apps.starter.services;

import java.util.List;
import com.ama.apps.starter.model.ExpenseType;

public interface ExpenseTypeService {    
	List<ExpenseType> getAllExpenseType();
    ExpenseType getExpenseTypeById(Long id);
}
