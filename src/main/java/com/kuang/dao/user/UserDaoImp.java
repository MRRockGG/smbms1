package com.kuang.dao.user;

import com.kuang.dao.BaseDao;
import com.kuang.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class UserDaoImp implements UserDao {
    @Override
    public User getLoginUser(Connection connection, String userCode) throws SQLException {
        PreparedStatement pstm = null;
        ResultSet rs = null;
        User user = null;
        if (connection != null) {
            String sql = "select * from smbms_user where userCode=?";
            Object[] params = {userCode};

            rs = BaseDao.execute(connection, pstm, rs, sql, params);
            if (rs.next()) {

                user = new User();
                user.setId(rs.getInt("id          "));
                user.setUserCode(rs.getString("userCode    "));
                user.setUserName(rs.getString("userName    "));
                user.setUserPassword(rs.getString("serPassword "));
                user.setGender(rs.getInt("gender      "));
                user.setBirthday(rs.getDate("birthday    "));
                user.setPhone(rs.getString("phone       "));
                user.setAddress(rs.getString("address     "));
                user.setUserRole(rs.getInt("userRole    "));
                user.setCreatedBy(rs.getInt("createdBy   "));
                user.setCreationDate(rs.getTimestamp("creationDate"));
                user.setModifyBy(rs.getInt("modifyBy    "));
                user.setModifyDate(rs.getTimestamp("modifyDate  "));
                user.setUserRoleName(rs.getString("userRoleName"));

            }
            BaseDao.closeResource(null, pstm, rs);

        }


        return user;
    }
}
