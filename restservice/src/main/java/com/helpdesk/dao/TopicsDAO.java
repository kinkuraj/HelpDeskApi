/**
 * 
 */
package com.helpdesk.dao;

import java.util.List;

import com.helpdesk.model.Topic;

/**
 * @author C728472
 *
 */
public interface TopicsDAO {
	
	public void saveOrUpdate(Topic topic);
    
    public void delete(int topicId);
     
    public Topic get(int topicId);
     
    public List<Topic> getList();

}
