/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Mare
 */
@Embeddable
public class MestoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "mestoId")
    private long mestoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ustanovaId")
    private long ustanovaId;

    public MestoPK() {
    }

    public MestoPK(long mestoId, long ustanovaId) {
        this.mestoId = mestoId;
        this.ustanovaId = ustanovaId;
    }

    public long getMestoId() {
        return mestoId;
    }

    public void setMestoId(long mestoId) {
        this.mestoId = mestoId;
    }

    public long getUstanovaId() {
        return ustanovaId;
    }

    public void setUstanovaId(long ustanovaId) {
        this.ustanovaId = ustanovaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) mestoId;
        hash += (int) ustanovaId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MestoPK)) {
            return false;
        }
        MestoPK other = (MestoPK) object;
        if (this.mestoId != other.mestoId) {
            return false;
        }
        if (this.ustanovaId != other.ustanovaId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.romb.domain.MestoPK[ mestoId=" + mestoId + ", ustanovaId=" + ustanovaId + " ]";
    }
    
}
