package xyz.hardik.entity;

import javax.persistence.*;

/**
 * Created by HARDIK on 21-05-2017.
 */

@Entity
@Table(name = "Cobrands")
public class Cobrands {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int srNo;

    @Column(name = "CobrandName")
    private String cobrandName;

    @Column(name = "CobrandId")
    private String cobrandsId;

    public void setCobrandName(String cobrandName) {
        this.cobrandName = cobrandName;
    }

    public void setCobrandsId(String cobrandsId) {
        this.cobrandsId = cobrandsId;
    }

    public int getSrNo() {
        return srNo;
    }

    public String getCobrandName() {
        return cobrandName;
    }

    public String getCobrandsId() {
        return cobrandsId;
    }
}

