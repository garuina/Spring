package kr.co.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore.dao.CustomerDAO;
import kr.co.bookstore.vo.CustomerVO;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO dao;
	
	public void insertCustomer(CustomerVO cv) {
		dao.insertCustomer(cv);
	}
	
	public CustomerVO selectCustomer(int custId) {
		return dao.selectCustomer(custId);
	}
	
	public List<CustomerVO> selectCustomers() {
		return dao.selectCustomers();
	}
	
	public void updateCustomer(CustomerVO cv) {
		dao.updateCustomer(cv);
	}
	
	public void deleteCustomer(int custId) {
		dao.deleteCustomer(custId);;
	}
	
}
