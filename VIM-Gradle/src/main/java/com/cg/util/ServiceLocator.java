
package com.cg.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
/*NA*/
/**
 * 
 * This is a ServiceLocator class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */

/**
 * <code>ServiceLocator</code> encapsulates JNDI lookups to make it
 * easier to access JNDI-based resources (EJBs, DataSources,
 * JMS Destinations, and so on).
 *
 */
public class ServiceLocator {

    /**
     * Making the default (no arg) constructor private
     * ensures that this class cannnot be instantiated.  
     */
    private ServiceLocator() {}
    
    
    /**
     * Gets a <code>DataSource</code> using the given JNDI name.
     *
     * @param dataSourceJndiName The <code>DataSource</code>'s JNDI name.
     *
     * @return DataSource The <code>DataSource</code>.
     *
     * @throws ServiceLocatorException If there are JNDI lookup problems.
     *
     * @see javax.sql.DataSource
     */
    public static DataSource getDataSource(String dataSourceJndiName) throws ServiceLocatorException {
        DataSource dataSource = null;

        try {
            Context ctx = new InitialContext();
//            This line is commented because lookup should not be "java:/comp/env"; it has to be "java:comp/env"
//            Context envContext  = (Context)ctx.lookup("java:/comp/env");
            
            Context envContext  = (Context)ctx.lookup("java:comp/env");
            dataSource = (DataSource) envContext.lookup(dataSourceJndiName);
            
//            For GlassFish
//          dataSource = (DataSource) ctx.lookup(dataSourceJndiName);
            
        } catch (ClassCastException cce) {
            throw new ServiceLocatorException(cce);
        } catch (NamingException ne) {
            throw new ServiceLocatorException(ne);
        }

        return dataSource;
    }
}
