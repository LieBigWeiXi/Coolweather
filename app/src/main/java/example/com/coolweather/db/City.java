package example.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xi1995123@126.com on 2017/5/17.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;//记录市名
    private int cityCode;//记录市代号
    private int provinceId;//市所属的省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
