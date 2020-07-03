package com.pardxa.dbreader.pojo;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface InterfaceTbl {
  @Select("Select * from TBL")
  ArrayList<Tbl> getTbl();
}
