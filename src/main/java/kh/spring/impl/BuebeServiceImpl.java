package kh.spring.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kh.spring.dto.BuebeDTO;
import kh.spring.interfaces.BuebeDAO;
import kh.spring.interfaces.BuebeService;
@Service
public class BuebeServiceImpl implements BuebeService {

	@Autowired
	private BuebeDAO dao;
	
	@Override
	
	public int insertData(BuebeDTO dto) {
		
		return this.dao.insertData(dto);
	}

	@Override
	public List<BuebeDTO> selectData() {
	
		return this.dao.selectData();
	}

	@Override
	public int updateData(BuebeDTO dto) {
		
		return this.dao.updateData(dto);
	}

	@Override
	public int deleteData(int seq) {
	
		return this.dao.deleteData(seq);
	}

}
