package com.example.demo;

public class Config {
  private String serviceName;

  private String servicePath;

  private String serviceType;

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getServicePath() {
    return servicePath;
  }

  @Override
  public String toString() {
    return "Config [serviceName=" + serviceName + ", servicePath=" + servicePath + ", serviceType=" + serviceType
        + ", isRequired=" + isRequired + "]";
  }

  public void setServicePath(String servicePath) {
    this.servicePath = servicePath;
  }

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public boolean isRequired() {
    return isRequired;
  }

  public void setRequired(boolean isRequired) {
    this.isRequired = isRequired;
  }

  private boolean isRequired;


}
