package kh.spring.interfaces;

import java.util.List;

import kh.spring.dto.BuebeDTO;

public interface BuebeDAO {
	public int insertData(BuebeDTO dto);
	public List<BuebeDTO> selectData();
	public int updateData(BuebeDTO dto);
	public int deleteData(int seq);
}
