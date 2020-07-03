package com.pardxa.dbreader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.beans.factory.annotation.Autowired;
import com.pardxa.dbreader.tables.Tbls;


@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Tbls")
@Path("/tbls")
public class TblRes {
  @Autowired
  private TblService svc;

  @GET
  @Produces("application/json")
  public Tbls getAllTbls() {
    Tbls tbls=new Tbls();
    tbls.setTabls(svc.getData());
    return tbls;
  }


}
