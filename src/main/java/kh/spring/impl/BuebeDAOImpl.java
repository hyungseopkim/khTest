package kh.spring.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kh.spring.dto.BuebeDTO;
import kh.spring.interfaces.BuebeDAO;
@Repository
public class BuebeDAOImpl implements BuebeDAO{
	@Autowired
	private JdbcTemplate template;
	
	
	@Override
	public int insertData(BuebeDTO dto) {
		String sql ="insert into buebe values(buebe_seq.nextval,?,?,?,sysdate,?)";		
		return template.update(sql,dto.getWriter(),dto.getTitle(),dto.getContents(),dto.getPassword());
	}

	@Override
	public List<BuebeDTO> selectData() {
		String sql="select * from buebe";
		return template.query(sql, new RowMapper<BuebeDTO>() {
			public BuebeDTO mapRow(ResultSet rs, int rownum) throws SQLException {
				 BuebeDTO dto =new BuebeDTO();
				 dto.setSeq(rs.getInt("seq"));
				 dto.setWriter(rs.getString("writer"));
				 dto.setTitle(rs.getString("title"));
				 dto.setContents(rs.getString("contents"));
				 dto.setWritedate(rs.getString("wirtedate"));
				return dto;
			}
		});
	}

	@Override
	public int updateData(BuebeDTO dto) {
		String sql="update buebe set title=?,contents=? where seq=?";
		return template.update(sql,dto.getTitle(),dto.getContents(),dto.getSeq());
	}

	@Override
	public int deleteData(int seq) {
		String sql ="delete from buebe where seq=?";
		return template.update(sql,seq);
	}

	@Override
	public BuebeDTO getArticle(int seq) {
		String sql = "SELECT * FROM BUEBE WHERE SEQ = ?";
		return (BuebeDTO)template.queryForObject(sql, new Object[] {seq}, new RowMapper(){
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				BuebeDTO dto = new BuebeDTO();
				dto.setSeq(rs.getInt("seq"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setContents(rs.getString("contents"));
				return dto;
			}
		});
	}
}
