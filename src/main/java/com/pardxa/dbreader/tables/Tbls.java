package com.pardxa.dbreader.tables;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.pardxa.dbreader.pojo.Tbl;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Tabls")
public class Tbls {
  @XmlElement(name = "Tabls")
  private ArrayList<Tbl> tabls;

  public ArrayList<Tbl> getTabls() {
    return tabls;
  }

  public void setTabls(ArrayList<Tbl> tabls) {
    this.tabls = tabls;
  }
}
