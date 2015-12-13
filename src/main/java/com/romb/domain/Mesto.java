/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author Mare
 */
@Entity
@Table(name = "mesto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesto.findAll", query = "SELECT m FROM Mesto m"),
    @NamedQuery(name = "Mesto.findByMestoId", query = "SELECT m FROM Mesto m WHERE m.mestoPK.mestoId = :mestoId"),
    @NamedQuery(name = "Mesto.findByUstanovaId", query = "SELECT m FROM Mesto m WHERE m.mestoPK.ustanovaId = :ustanovaId"),
    @NamedQuery(name = "Mesto.findByRezervacija", query = "SELECT m FROM Mesto m WHERE m.rezervacija = :rezervacija")})
public class Mesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MestoPK mestoPK;
    @Column(name = "rezervacija")
    private boolean rezervacija;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mesto")
    private List<StudentMesto> studentMestoList;
    @JoinColumn(name = "ustanovaId", referencedColumnName = "ustanovaId", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ustanova ustanova;

    public Mesto() {
    }

    public Mesto(MestoPK mestoPK) {
        this.mestoPK = mestoPK;
    }

    public Mesto(long mestoId, long ustanovaId) {
        this.mestoPK = new MestoPK(mestoId, ustanovaId);
    }

    public MestoPK getMestoPK() {
        return mestoPK;
    }

    public void setMestoPK(MestoPK mestoPK) {
        this.mestoPK = mestoPK;
    }

    public boolean getRezervacija() {
        return rezervacija;
    }

    public void setRezervacija(Boolean rezervacija) {
        this.rezervacija = rezervacija;
    }

    @XmlTransient
    @JsonIgnore
    public List<StudentMesto> getStudentMestoList() {
        return studentMestoList;
    }

    public void setStudentMestoList(List<StudentMesto> studentMestoList) {
        this.studentMestoList = studentMestoList;
    }

    public Ustanova getUstanova() {
        return ustanova;
    }

    public void setUstanova(Ustanova ustanova) {
        this.ustanova = ustanova;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mestoPK != null ? mestoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesto)) {
            return false;
        }
        Mesto other = (Mesto) object;
        if ((this.mestoPK == null && other.mestoPK != null) || (this.mestoPK != null && !this.mestoPK.equals(other.mestoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.romb.domain.Mesto[ mestoPK=" + mestoPK + " ]";
    }
    
}
