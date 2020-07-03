package com.pardxa.dbreader.pojo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="Tbl")
public class Tbl implements Serializable{
  private static final long serialVersionUID = 1L;
  @XmlAttribute(name="id")
  private int id;
  @XmlAttribute(name="Column1")
  private String Column1;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getColumn1() {
    return Column1;
  }
  public void setColumn1(String column1) {
    Column1 = column1;
  }
}

