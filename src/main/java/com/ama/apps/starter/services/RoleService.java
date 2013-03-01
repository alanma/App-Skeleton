package com.ama.apps.starter.services;

import com.ama.apps.starter.model.Role;
public interface RoleService {
    Role getRole(Long id);

    Role getRoleByName(String name);
}
