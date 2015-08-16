/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.github.pires.obd.reader.net;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * DTO for OBD readings.
 */
public class ObdReading {
  private double latitude, longitude, altitude;
  private long timestamp;
  private float accuracy;
  private float bearing;

  private String vin; // vehicle id
  private Map<String, String> readings;

  public ObdReading(){
    readings = new HashMap<>();
  }

  public ObdReading(double latitude, double longitude, long timestamp,
                    String vin, Map<String, String> readings) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.timestamp = timestamp;
    this.vin = vin;
    this.readings = readings;
  }

  public ObdReading(double latitude, double longitude, long timestamp, String vin, Map<String, String> readings, double altitude, float accuracy, float bearing) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.altitude = altitude;
    this.timestamp = timestamp;
    this.accuracy = accuracy;
    this.bearing = bearing;
    this.vin = vin;
    this.readings = readings;
  }

  public void setAccuracy(float accuracy) {
    this.accuracy = accuracy;
  }

  public void setBearing(float bearing) {
    this.bearing = bearing;
  }

  public float getBearing() {

    return bearing;
  }

  public float getAccuracy() {
    return accuracy;
  }

  public void setAltitude(double altitude) {
    this.altitude = altitude;
  }

  public double getAltitude() {
    return altitude;
  }

  public double getLatitude() {
    return latitude;
  }
  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public Map<String, String> getReadings() {
    return readings;
  }

  public void setReadings(Map<String, String> readings) {
    this.readings = readings;
  }
  
  public String toString(){

    return "lat:" + latitude + ";" +
            "long:" + longitude + ";" +
            "vin:" + vin + ";" +
            "readings:" + readings.toString().substring(10).replace("}","").replace(",",";");
  }

}