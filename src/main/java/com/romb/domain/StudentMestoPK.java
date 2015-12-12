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
public class StudentMestoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "studentId")
    private long studentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mestoId")
    private long mestoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ustanovaId")
    private long ustanovaId;

    public StudentMestoPK() {
    }

    public StudentMestoPK(long studentId, long mestoId, long ustanovaId) {
        this.studentId = studentId;
        this.mestoId = mestoId;
        this.ustanovaId = ustanovaId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
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
        hash += (int) studentId;
        hash += (int) mestoId;
        hash += (int) ustanovaId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentMestoPK)) {
            return false;
        }
        StudentMestoPK other = (StudentMestoPK) object;
        if (this.studentId != other.studentId) {
            return false;
        }
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
        return "com.romb.domain.StudentMestoPK[ studentId=" + studentId + ", mestoId=" + mestoId + ", ustanovaId=" + ustanovaId + " ]";
    }
    
}
