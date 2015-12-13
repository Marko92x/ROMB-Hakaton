/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.help;

/**
 *
 * @author Mare
 */
public class MestaUstanove {
    
    private long idUstanove;
    private String nazivUstanove;
    private String longitude;
    private String latitude;
    private int brojMesta;
    private int brojSlobodnihMesta;
    private int brojZauzetihMesta;
    private String opis;

    public int getBrojMesta() {
        return brojMesta;
    }

    public void setBrojMesta(int brojMesta) {
        this.brojMesta = brojMesta;
    }

    public int getBrojSlobodnihMesta() {
        return brojSlobodnihMesta;
    }

    public void setBrojSlobodnihMesta(int brojSlobodnihMesta) {
        this.brojSlobodnihMesta = brojSlobodnihMesta;
    }

    public int getBrojZauzetihMesta() {
        return brojZauzetihMesta;
    }

    public void setBrojZauzetihMesta(int brojZauzetihMesta) {
        this.brojZauzetihMesta = brojZauzetihMesta;
    }

    public long getIdUstanove() {
        return idUstanove;
    }

    public void setIdUstanove(long idUstanove) {
        this.idUstanove = idUstanove;
    }

    public String getNazivUstanove() {
        return nazivUstanove;
    }

    public void setNazivUstanove(String nazivUstanove) {
        this.nazivUstanove = nazivUstanove;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
    
    
}
