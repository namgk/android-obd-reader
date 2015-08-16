package com.github.pires.obd.reader.net;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nam Giang on 2015-08-08.
 */
public class DataCompressor {

    public static final Map<String, String> compressCmdMap;

    static {
        Map<String, String> cmdMap = new HashMap<String, String>();
        cmdMap.put("AIR_INTAKE_TEMP","c1");//Air Intake Temperature"),
        cmdMap.put("AMBIENT_AIR_TEMP","c2");//Ambient Air Temperature"),
        cmdMap.put("ENGINE_COOLANT_TEMP","c3");//Engine Coolant Temperature"),
        cmdMap.put("BAROMETRIC_PRESSURE","c4");//Barometric Pressure"),
        cmdMap.put("FUEL_PRESSURE","c5");//Fuel Pressure"),
        cmdMap.put("INTAKE_MANIFOLD_PRESSURE","c6");//Intake Manifold Pressure"),
        cmdMap.put("ENGINE_LOAD","c7");//Engine Load"),
        cmdMap.put("ENGINE_RUNTIME","c8");//Engine Runtime"),
        cmdMap.put("ENGINE_RPM","c9");//Engine RPM"),
        cmdMap.put("SPEED","c10");//Vehicle Speed"),
        cmdMap.put("MAF","c11");//Mass Air Flow"),
        cmdMap.put("THROTTLE_POS","c12");//Throttle Position"),
        cmdMap.put("TROUBLE_CODES","c13");//Trouble Codes"),
        cmdMap.put("FUEL_LEVEL","c14");//Fuel Level"),
        cmdMap.put("FUEL_TYPE","c15");//Fuel Type"),
        cmdMap.put("FUEL_CONSUMPTION","c16");//Fuel Consumption"),
        cmdMap.put("FUEL_ECONOMY","c17");//Fuel Economy"),
        cmdMap.put("FUEL_ECONOMY_WITH_MAF","c18");//Fuel Economy 2"),
        cmdMap.put("FUEL_ECONOMY_WITHOUT_MAF","c19");//Fuel Economy 3"),
        cmdMap.put("TIMING_ADVANCE","c20");//Timing Advance"),
        cmdMap.put("DTC_NUMBER","c21");//Diagnostic Trouble Codes"),
        cmdMap.put("EQUIV_RATIO","c22");//Command Equivalence Ratio"),
        cmdMap.put("DISTANCE_TRAVELED_AFTER_CODES_CLEARED","c23");//Distance Traveled After Codes Cleared"),
        cmdMap.put("CONTROL_MODULE_VOLTAGE","c24");//Control Module Power Supply "),
        cmdMap.put("ENGINE_FUEL_RATE","c25");//Engine Fuel Rate"),
        cmdMap.put("FUEL_RAIL_PRESSURE","c26");//Fuel Rail Pressure"),
        cmdMap.put("VIN","c27");//Vehicle Identification Number (VIN)"),
        cmdMap.put("DISTANCE_TRAVELED_MIL_ON","c28");//Distance traveled with MIL on"),
        cmdMap.put("TIME_TRAVELED_MIL_ON","c29");//Time run with MIL on"),
        cmdMap.put("TIME_SINCE_TC_CLEARED","c30");//Time since trouble codes cleared"),
        cmdMap.put("REL_THROTTLE_POS","c31");//Relative throttle position"),
        cmdMap.put("PIDS","c32");//Available PIDs");
        cmdMap.put("Long Term Fuel Trim Bank 1","c33");
        cmdMap.put("Long Term Fuel Trim Bank 2","c34");
        cmdMap.put("Short Term Fuel Trim Bank 1","c35");
        cmdMap.put("Short Term Fuel Trim Bank 2","c36");
        cmdMap.put("timestamp","c37");
        cmdMap.put("longitude","c38");
        cmdMap.put("latitude","c38");

        compressCmdMap = Collections.unmodifiableMap(cmdMap);
    }

}
