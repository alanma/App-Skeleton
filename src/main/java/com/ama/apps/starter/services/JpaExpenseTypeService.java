package com.ama.apps.starter.services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import com.ama.apps.starter.model.ExpenseType;
import com.ama.apps.starter.services.ExpenseTypeService;

@Service
public class JpaExpenseTypeService implements ExpenseTypeService {

    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<ExpenseType> getAllExpenseType() {
        return getEntityManager().createQuery("from ExpenseType", ExpenseType.class).getResultList();
    }

    public ExpenseType getExpenseTypeById(Long id) {
        return getEntityManager().find(ExpenseType.class, id);
    }
}
