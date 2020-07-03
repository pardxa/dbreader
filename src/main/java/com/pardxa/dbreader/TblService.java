package com.pardxa.dbreader;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pardxa.dbreader.pojo.InterfaceTbl;
import com.pardxa.dbreader.pojo.Tbl;
@Service
public class TblService {
  @Autowired
  InterfaceTbl itbl;
  public ArrayList<Tbl> getData() {
    return itbl.getTbl();
//    ArrayList<Tbl> t = new ArrayList<Tbl>();
//    Tbl t1 = new Tbl();
//    t1.setId(111);
//    t1.setColumn1("first table");
//    t.add(t1);
//    Tbl t2 = new Tbl();
//    t2.setId(222);
//    t2.setColumn1("second table");
//    t.add(t2);
//    return t;
  } 
}
