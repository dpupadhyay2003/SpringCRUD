package mainCom.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import mainCom.dao.Dao;
import mainCom.model.NameVo;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	Dao dao;

	@Transactional
	public void insert(NameVo nameVo) {
		dao.insert(nameVo);
	}
	
	@Transactional
	public List<Object> search(String query) {
		return dao.search(query);
	}
	
	@Transactional
	public void delete(Object object) {
		dao.delete(object);
	}
	
}