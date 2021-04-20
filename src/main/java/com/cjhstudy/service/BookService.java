package com.cjhstudy.service;

import com.cjhstudy.pojo.Books;

import java.util.List;

/**
 * @author: phil
 * @ProjectName: ssmbuild
 * @Date: 2021/4/20
 */
//BookService：底层需要去实现，调用dao层
public interface BookService {
    //增加一个Book
    int addBook(Books book);
    //根据id删除一个Book
    int deleteBookById(int id);
    //更新Book
    int updateBook(Books books);
    //根据id查询,返回一个Book
    Books queryBookById(int id);
    //查询全部Book,返回list集合
    List<Books> queryAllBook();
    //按照书名查询
    Books queryBookByName(String bookName);
}
