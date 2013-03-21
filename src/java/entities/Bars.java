/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
 * @author Marina
 */
@Entity
@Table(name = "BARS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bars.findAll", query = "SELECT b FROM Bars b"),
    @NamedQuery(name = "Bars.findById", query = "SELECT b FROM Bars b WHERE b.id = :id"),
    @NamedQuery(name = "Bars.findByTitle", query = "SELECT b FROM Bars b WHERE b.title = :title")})
public class Bars implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TITLE")
    private String title;
    @OneToMany(mappedBy = "barsId")
    private Collection<Pricelist1> pricelist1Collection;

    public Bars() {
    }

    public Bars(Integer id) {
        this.id = id;
    }

    public Bars(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Pricelist1> getPricelist1Collection() {
        return pricelist1Collection;
    }

    public void setPricelist1Collection(Collection<Pricelist1> pricelist1Collection) {
        this.pricelist1Collection = pricelist1Collection;
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
        if (!(object instanceof Bars)) {
            return false;
        }
        Bars other = (Bars) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bars[ id=" + id + " ]";
    }
    
}
