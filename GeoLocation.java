/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labhibernate;

/**
 *
 * @author dell
 */

public class GeoLocation {
    //locId,country,region,city,postalCode,latitude,longitude,metroCode,areaCode
    public String locId;
    public String country;
    public String region;
    public String city;
    public String postalCode;
    public String latitude;
    public String longitude;
    public static int id=0;
    public int getId()
    {
        return id;
    }
    public String getLocId()
    {
        return locId;
    }
    public String getLatitude()
    {
        return latitude;
    }
    public String getLongitude()
    {
        return longitude;
    }
    public String getCountry()
    {
        return country;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String c)
    {
        city =c;
    }
    public void setId(int i)
    {
        this.id=i;
    }
    public void setLocId(String l)
    {
        this.locId=l;
    }
    public void setLatitude(String lat)
    {
        this.latitude=lat;
    }
    public void setLongitude(String longs)
    {
        this.longitude=longs;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public GeoLocation()
    {
        id+=1;
    }
    public GeoLocation(String locId, String c, String city, String latitude, String longitude )
    {
        id+=1;
        this.locId=locId; this.country=c;  this.city=city;
        this.latitude=latitude; this.longitude=longitude;
    }
    public void print()
    {
        System.out.print(locId);
        System.out.print(", ");
        System.out.print(country);
        System.out.print(", ");
        System.out.print(longitude);
        System.out.print(", ");
        System.out.println(latitude);

    }
}