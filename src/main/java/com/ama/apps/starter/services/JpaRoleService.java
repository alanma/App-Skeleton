package com.ama.apps.starter.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ama.apps.starter.model.Role;
import com.ama.apps.starter.services.RoleService;

@Service
public class JpaRoleService implements RoleService {

    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public Role getRole(Long id) {
        return getEntityManager().find(Role.class, id);
    }

    @Transactional
    public Role getRoleByName(String name) {
        Query query = getEntityManager().createQuery("select r from Role r where "
             + "roleName =:roleName", Role.class);
                query.setParameter("roleName", name);
        return (query.getResultList() != null && query.getResultList().size() > 0)
                ? (Role) query.getResultList().get(0) : null;
    }
}
