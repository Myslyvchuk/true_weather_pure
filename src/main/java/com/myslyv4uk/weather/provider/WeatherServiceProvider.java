package com.myslyv4uk.weather.provider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myslyv4uk.weather.api.WeatherService;
import com.myslyv4uk.weather.impl.WeatherServiceImpl;

public class WeatherServiceProvider implements BundleActivator {
  
  private static final Logger logger = LoggerFactory.getLogger(WeatherServiceProvider.class);
  private ServiceRegistration registration;

  @Override
  public void start(BundleContext context) throws Exception {
    logger.info("Service WeatherServiceImpl started");
    registration = context.registerService(
        WeatherService.class.getName(),
        new WeatherServiceImpl(),
        null);
    
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    logger.info("Service WeatherServiceImpl stopped");
    registration.unregister();
  }
}
