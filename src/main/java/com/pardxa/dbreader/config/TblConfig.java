package com.pardxa.dbreader.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import com.pardxa.dbreader.TblRes;

@Component
public class TblConfig extends ResourceConfig {
  public TblConfig() {
    this.register(TblRes.class);
  }
}
