package com.infobola.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author roky.manalu
 */
@Entity
@Table(name = "hasil")
public class Hasil implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 10, nullable = false)
    private Integer idLiga;
    @Column(length = 20, nullable = false)
    private String hari;
    @Column(length = 20, nullable = false)
    private String tanggal;
    @Column(length = 100, nullable = false)
    private String tim1;
    @Column(length = 20, nullable = false)
    private String skor;
    @Column(length = 100, nullable = false)
    private String tim2;

    public Hasil() {

    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the hari
     */
    public String getHari() {
        return hari;
    }

    /**
     * @param hari the hari to set
     */
    public void setHari(String hari) {
        this.hari = hari;
    }

    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the tim1
     */
    public String getTim1() {
        return tim1;
    }

    /**
     * @param tim1 the tim1 to set
     */
    public void setTim1(String tim1) {
        this.tim1 = tim1;
    }

    /**
     * @return the skor
     */
    public String getSkor() {
        return skor;
    }

    /**
     * @param skor the skor to set
     */
    public void setSkor(String skor) {
        this.skor = skor;
    }

    /**
     * @return the tim2
     */
    public String getTim2() {
        return tim2;
    }

    /**
     * @param tim2 the tim2 to set
     */
    public void setTim2(String tim2) {
        this.tim2 = tim2;
    }

    /**
     * @return the idLiga
     */
    public Integer getIdLiga() {
        return idLiga;
    }

    /**
     * @param idLiga the idLiga to set
     */
    public void setIdLiga(Integer idLiga) {
        this.idLiga = idLiga;
    }

}
