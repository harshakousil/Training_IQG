package training.iqgateway.business.impl;

import training.iqgateway.RoleDAOImpl;
import training.iqgateway.business.AdminOperations;
import training.iqgateway.dao.RoleDAO;
import training.iqgateway.entities.RoleEO;

public class AdminOperationsImpl implements AdminOperations {
    
    private RoleDAO roleDAORef = new RoleDAOImpl();
    
    public AdminOperationsImpl() {
        super();
    }

    public String addNewRole(RoleEO roleEORef) {
        return roleDAORef.insertRole(roleEORef);
    }
}
