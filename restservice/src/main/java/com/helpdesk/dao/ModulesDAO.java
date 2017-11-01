/**
 * 
 */
package com.helpdesk.dao;

import java.util.List;

import com.helpdesk.model.Modules;
import com.helpdesk.model.Topic;

/**
 * @author C728472
 *
 */
public interface ModulesDAO {
	
	public void saveOrUpdate(Modules modules);
    
    public void delete(int moduleId);
     
    public Topic get(int moduleId);
     
    public List<Modules> getList();

}
