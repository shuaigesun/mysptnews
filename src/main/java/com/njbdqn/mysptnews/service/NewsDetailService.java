package com.njbdqn.mysptnews.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.njbdqn.mysptnews.dao.INewsDetailDAO;
import com.njbdqn.mysptnews.vo.NewsComment;
import com.njbdqn.mysptnews.vo.NewsDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewsDetailService {
    @Resource
    private INewsDetailDAO iNewsDetailDAO;

    //模糊查询分页
    public PageInfo<NewsDetail> getBean(int cp, String title){
        Page<NewsDetail> pg = PageHelper.startPage(cp,8);
        iNewsDetailDAO.findAll(title);
        return new PageInfo<NewsDetail>(pg);
    }
//    //查看评论
//    public List<NewsComment> findByid(Integer id){
//        return iNewsDetailDAO.findByid(id);
//    }
//    //增加评论
//    public void addComment(NewsComment newsComment){
//        iNewsDetailDAO.addComment(newsComment);
//    }
//    //删除新闻
//    public void delNewsDetail(Integer id){
//        iNewsDetailDAO.delNewsDetail(id);
//    }
//    //删除评论
//    public void delNewsComment(Integer id){
//        iNewsDetailDAO.delNewsComment(id);
//    }
//    //count
//    public Integer count(String title){
//        return iNewsDetailDAO.count(title);
//    }
}
