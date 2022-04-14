/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamapp;

/**
 *
 * @author ztjam
 */
public abstract class MAM {
   protected Integer WaterNo, StretchNo, BreakNo;


public MAM() {
WaterNo = 0;
StretchNo= 0;
BreakNo= 0;

}

    public Integer getWaterNo() {
        return WaterNo;
    }

    public void setWaterNo(Integer WaterNo) {
        this.WaterNo = WaterNo;
    }

    public Integer getStretchNo() {
        return StretchNo;
    }

    public void setStretchNo(Integer StretchNo) {
        this.StretchNo = StretchNo;
    }

    public Integer getBreakNo() {
        return BreakNo;
    }

    public void setBreakNo(Integer BreakNo) {
        this.BreakNo = BreakNo;
    }

  








}