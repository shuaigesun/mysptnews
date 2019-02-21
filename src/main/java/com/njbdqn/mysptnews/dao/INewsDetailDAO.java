package com.njbdqn.mysptnews.dao;

import com.njbdqn.mysptnews.vo.NewsComment;
import com.njbdqn.mysptnews.vo.NewsDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface INewsDetailDAO {
    //模糊查询分页
    public List<NewsDetail> findAll(@Param("title")String title);
//    //查看评论
//    public List<NewsComment> findByid(@Param("id")Integer id);
//    //增加评论
//    public void addComment(@Param("newsComment")NewsComment newsComment);
//    //删除新闻
//    public void delNewsDetail(@Param("id")Integer id);
//    //删除评论
//    public void delNewsComment(@Param("id")Integer id);
//    //count
//    public Integer count(@Param("title")String title);
}
