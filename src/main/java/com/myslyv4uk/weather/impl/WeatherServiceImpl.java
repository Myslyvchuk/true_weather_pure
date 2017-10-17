package com.myslyv4uk.weather.impl;

import java.util.concurrent.ThreadLocalRandom;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myslyv4uk.weather.api.WeatherService;

public class WeatherServiceImpl implements WeatherService {
  
  @Override
  public int getCurrentTemperaturePure(int from, int to) {
    return ThreadLocalRandom.current().nextInt(from, to + 1);
  }
  
}
