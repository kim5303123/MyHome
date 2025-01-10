package himedia.kdt.myhome.dao;

import java.util.List;

import himedia.kdt.myhome.vo.UserVo;

public interface UserDao {

	public List<UserVo> getList();
	public boolean insert(UserVo userVo);
	public boolean update(UserVo userVo);
	public boolean delete(Integer no);
	public UserVo getUserByIdAndPassword(String email, String Password);
	
}
