package kh.spring.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.spring.dto.BuebeDTO;
import kh.spring.interfaces.BuebeDAO;
import kh.spring.interfaces.BuebeService;
@Service
public class BuebeServiceImpl implements BuebeService {

	@Autowired
	private BuebeDAO dao;
	
	@Override
	public int insertData(BuebeDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BuebeDTO> selectData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateData(BuebeDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteData(int seq) {
		// TODO Auto-generated method stub
		return 0;
	}

}
