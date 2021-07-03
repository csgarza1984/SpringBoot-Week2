package com.promineotech.jeep2.service;

import java.util.List;
import com.promineotech.jeep2.entity.Jeep;
import com.promineotech.jeep2.entity.JeepModel;

public interface JeepSalesService {

  /**
   * 
   * @param model
   * @param trim
   * @return
   */
  List<Jeep> fetchJeeps(JeepModel model, String trim);

}
