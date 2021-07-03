package com.promineotech.jeep2.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineotech.jeep2.entity.Jeep;
import com.promineotech.jeep2.entity.JeepModel;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class defaultJeepSalesService implements JeepSalesService {

  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    log.info("The fetchJeeps method was called with model={} and trim={}", model, trim);
    return null;
  }

}
