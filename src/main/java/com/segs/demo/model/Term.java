package com.segs.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TERMS")
public class Term {
    @Id
    @Column(name = "TRMID")
    private Long id;

    @Column(name = "TRMNAME")
    private String name;

    @Column(name = "TRMROWSTATE")
    private Integer rowState;

    @Column(name = "TRMFIELD1")
    private Integer field1;

    @ManyToOne
    @JoinColumn(name = "TRMAYRID")
    private AcademicYear academicYear;

    @ManyToOne
    @JoinColumn(name = "CRSID") // ← replace with actual column name in table
    private Course course;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRowState() {
        return rowState;
    }

    public void setRowState(Integer rowState) {
        this.rowState = rowState;
    }

    public Integer getField1() {
        return field1;
    }

    public void setField1(Integer field1) {
        this.field1 = field1;
    }

    public AcademicYear getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(AcademicYear academicYear) {
        this.academicYear = academicYear;
    }    

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
