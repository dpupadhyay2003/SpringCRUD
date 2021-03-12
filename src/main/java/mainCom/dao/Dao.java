package mainCom.dao;

import java.util.List;

public interface Dao {
	
	public void insert(Object object);
	
	public List<Object> search(String query);
	
	public void delete(Object object);
	
}
