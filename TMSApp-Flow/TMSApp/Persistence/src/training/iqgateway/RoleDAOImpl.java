package training.iqgateway;

import training.iqgateway.dao.RoleDAO;
import training.iqgateway.entities.RoleEO;

public class RoleDAOImpl implements RoleDAO {
    public RoleDAOImpl() {
        super();
    }

    public String insertRole(RoleEO roleEORef) {
        return "Admin";
    }
}
