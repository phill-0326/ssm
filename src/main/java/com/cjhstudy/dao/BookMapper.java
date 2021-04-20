package com.cjhstudy.dao;

import com.cjhstudy.pojo.Books;

import java.util.List;

/**
 * @author: phil
 * @ProjectName: ssmbuild
 * @Date: 2021/4/20
 */
public interface BookMapper {
    //增加一个Book
    int addBook(Books books);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询，返回一个Book
    Books queryBookById(int id);

    //查询全部的Book，返回list集合
    List<Books> queryAllBook();

    //按照书名查询
    Books queryBookByName(String bookName);

}
