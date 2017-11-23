package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class Journal implements Serializable {
    private Integer id;

    private String journaltitle;

    private String journaltype;

    private String journalscope;

    private Date journaldate;

    private String journalchment;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJournaltitle() {
        return journaltitle;
    }

    public void setJournaltitle(String journaltitle) {
        this.journaltitle = journaltitle;
    }

    public String getJournaltype() {
        return journaltype;
    }

    public void setJournaltype(String journaltype) {
        this.journaltype = journaltype;
    }

    public String getJournalscope() {
        return journalscope;
    }

    public void setJournalscope(String journalscope) {
        this.journalscope = journalscope;
    }

    public Date getJournaldate() {
        return journaldate;
    }

    public void setJournaldate(Date journaldate) {
        this.journaldate = journaldate;
    }

    public String getJournalchment() {
        return journalchment;
    }

    public void setJournalchment(String journalchment) {
        this.journalchment = journalchment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Journal journal = (Journal) o;

        return id.equals(journal.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Journal{" +
                "id=" + id +
                ", journaltitle='" + journaltitle + '\'' +
                ", journaltype='" + journaltype + '\'' +
                ", journalscope='" + journalscope + '\'' +
                ", journaldate=" + journaldate +
                ", journalchment='" + journalchment + '\'' +
                '}';
    }
}