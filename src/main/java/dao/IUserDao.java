package dao;


import model.User;

import java.util.List;

public interface IUserDao {
    //对于读取结果集
    //定义方法 listCategory同Category.xml里面的对应

    //查询所有的用户，返回类型为集合
    List<User> listCategory();
    List<User> list();

    //总记录数
    int total();

    //查询
    User selectUser(int id);

    //添加
    void add(User category);

    //删除
    void delete(int id);


    //更新
    void update(User category);
}
