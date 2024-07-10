/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s08.vehicle;

/**
 * List of the available engine types for vehicles
 * 
 * <li>Internal petrol combustion engine (ESS)
 * <li>Diesel internal combustion engine (DSL)
 * <li>Mild hybrid electric vehicle (MHEV)
 * <li>Hybrid electric vehicle (HEV)
 * <li>Plug-in hybrid electric vehicle (PHEV)
 * <li>Compressed natural gas engine (CNG)
 * <li>Liquefied petroleum gas engine (LPG)
 * <li>100% electric motor (battery electric vehicle – BEV)
 * <li>Fuel cell electric vehicle (FCEV)
 */
public enum Engine {
    ESS, DSL, MHEV, HEV, PHEV, CNG, LPG, BEV, FCEV
}
