/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romb.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mare
 */
@Entity
@Table(name = "student_mesto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudentMesto.findAll", query = "SELECT s FROM StudentMesto s"),
    @NamedQuery(name = "StudentMesto.findByStudentId", query = "SELECT s FROM StudentMesto s WHERE s.studentMestoPK.studentId = :studentId"),
    @NamedQuery(name = "StudentMesto.findByMestoId", query = "SELECT s FROM StudentMesto s WHERE s.studentMestoPK.mestoId = :mestoId"),
    @NamedQuery(name = "StudentMesto.findByUstanovaId", query = "SELECT s FROM StudentMesto s WHERE s.studentMestoPK.ustanovaId = :ustanovaId"),
    @NamedQuery(name = "StudentMesto.findByPin", query = "SELECT s FROM StudentMesto s WHERE s.pin = :pin")})
public class StudentMesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StudentMestoPK studentMestoPK;
    @Size(max = 4)
    @Column(name = "pin")
    private String pin;
    @JoinColumn(name = "studentId", referencedColumnName = "studentId", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Student student;
    @JoinColumns({
        @JoinColumn(name = "mestoId", referencedColumnName = "mestoId", insertable = false, updatable = false),
        @JoinColumn(name = "ustanovaId", referencedColumnName = "ustanovaId", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Mesto mesto;

    public StudentMesto() {
    }

    public StudentMesto(StudentMestoPK studentMestoPK) {
        this.studentMestoPK = studentMestoPK;
    }

    public StudentMesto(long studentId, long mestoId, long ustanovaId) {
        this.studentMestoPK = new StudentMestoPK(studentId, mestoId, ustanovaId);
    }

    public StudentMestoPK getStudentMestoPK() {
        return studentMestoPK;
    }

    public void setStudentMestoPK(StudentMestoPK studentMestoPK) {
        this.studentMestoPK = studentMestoPK;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentMestoPK != null ? studentMestoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentMesto)) {
            return false;
        }
        StudentMesto other = (StudentMesto) object;
        if ((this.studentMestoPK == null && other.studentMestoPK != null) || (this.studentMestoPK != null && !this.studentMestoPK.equals(other.studentMestoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.romb.domain.StudentMesto[ studentMestoPK=" + studentMestoPK + " ]";
    }
    
}
