package edu.bit.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.bit.ex.vo.NoticeVO;

@Mapper
public interface NoticeMapper {
    List<NoticeVO> getList();
}
