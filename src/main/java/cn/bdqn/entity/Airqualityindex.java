package cn.bdqn.entity;

import lombok.Data;

@Data
public class Airqualityindex {

  private long id;
  private long districtId;
  private java.sql.Timestamp monitorTime;
  private long pm10;
  private long pm25;
  private String monitoringStation;
  private java.sql.Timestamp lastModifyTime;

}
