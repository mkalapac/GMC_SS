/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marina
 */
@Entity
@Table(name = "PRICELIST_1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pricelist1.findAll", query = "SELECT p FROM Pricelist1 p"),
    @NamedQuery(name = "Pricelist1.findById", query = "SELECT p FROM Pricelist1 p WHERE p.id = :id"),
    @NamedQuery(name = "Pricelist1.findByName", query = "SELECT p FROM Pricelist1 p WHERE p.name = :name"),
    @NamedQuery(name = "Pricelist1.findByPrice", query = "SELECT p FROM Pricelist1 p WHERE p.price = :price")})
public class Pricelist1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 100)
    @Column(name = "NAME")
    private String name;
    @Size(max = 8)
    @Column(name = "PRICE")
    private String price;
    @JoinColumn(name = "CATEGORIES_ID", referencedColumnName = "ID")
    @ManyToOne
    private Categories categoriesId;
    @JoinColumn(name = "BARS_ID", referencedColumnName = "ID")
    @ManyToOne
    private Bars barsId;

    public Pricelist1() {
    }

    public Pricelist1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Categories getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(Categories categoriesId) {
        this.categoriesId = categoriesId;
    }

    public Bars getBarsId() {
        return barsId;
    }

    public void setBarsId(Bars barsId) {
        this.barsId = barsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pricelist1)) {
            return false;
        }
        Pricelist1 other = (Pricelist1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pricelist1[ id=" + id + " ]";
    }
    
}
