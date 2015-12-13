/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author Mare
 */
@Entity
@Table(name = "ustanova")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ustanova.findAll", query = "SELECT u FROM Ustanova u"),
    @NamedQuery(name = "Ustanova.findByUstanovaId", query = "SELECT u FROM Ustanova u WHERE u.ustanovaId = :ustanovaId"),
    @NamedQuery(name = "Ustanova.findByNaziv", query = "SELECT u FROM Ustanova u WHERE u.naziv = :naziv"),
    @NamedQuery(name = "Ustanova.findByLongitude", query = "SELECT u FROM Ustanova u WHERE u.longitude = :longitude"),
    @NamedQuery(name = "Ustanova.findByLatitude", query = "SELECT u FROM Ustanova u WHERE u.latitude = :latitude"),
    @NamedQuery(name = "Ustanova.findByBrojMesta", query = "SELECT u FROM Ustanova u WHERE u.brojMesta = :brojMesta")})
public class Ustanova implements Serializable {

    @Size(max = 10000)
    @Column(name = "opis")
    private String opis;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ustanovaId")
    private Long ustanovaId;
    @Size(max = 255)
    @Column(name = "naziv")
    private String naziv;
    @Size(max = 255)
    @Column(name = "longitude")
    private String longitude;
    @Size(max = 255)
    @Column(name = "latitude")
    private String latitude;
    @Column(name = "brojMesta")
    private Integer brojMesta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ustanova")
    private List<Mesto> mestoList;

    public Ustanova() {
    }

    public Ustanova(Long ustanovaId) {
        this.ustanovaId = ustanovaId;
    }

    public Long getUstanovaId() {
        return ustanovaId;
    }

    public void setUstanovaId(Long ustanovaId) {
        this.ustanovaId = ustanovaId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
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

    public Integer getBrojMesta() {
        return brojMesta;
    }

    public void setBrojMesta(Integer brojMesta) {
        this.brojMesta = brojMesta;
    }

    @XmlTransient
    @JsonIgnore
    public List<Mesto> getMestoList() {
        return mestoList;
    }

    public void setMestoList(List<Mesto> mestoList) {
        this.mestoList = mestoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ustanovaId != null ? ustanovaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ustanova)) {
            return false;
        }
        Ustanova other = (Ustanova) object;
        if ((this.ustanovaId == null && other.ustanovaId != null) || (this.ustanovaId != null && !this.ustanovaId.equals(other.ustanovaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.romb.domain.Ustanova[ ustanovaId=" + ustanovaId + " ]";
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
    
}
