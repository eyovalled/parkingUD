/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Estudiantes
 */
@Entity
@Table(name = "administrativo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrativo.findAll", query = "SELECT a FROM Administrativo a")
    , @NamedQuery(name = "Administrativo.findByIdAdministrativo", query = "SELECT a FROM Administrativo a WHERE a.idAdministrativo = :idAdministrativo")
    , @NamedQuery(name = "Administrativo.findByArea", query = "SELECT a FROM Administrativo a WHERE a.area = :area")
    , @NamedQuery(name = "Administrativo.findByOficina", query = "SELECT a FROM Administrativo a WHERE a.oficina = :oficina")
    , @NamedQuery(name = "Administrativo.findByCargo", query = "SELECT a FROM Administrativo a WHERE a.cargo = :cargo")})
public class Administrativo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_administrativo")
    private Integer idAdministrativo;
    @Size(max = 45)
    @Column(name = "area")
    private String area;
    @Size(max = 45)
    @Column(name = "oficina")
    private String oficina;
    @Size(max = 45)
    @Column(name = "cargo")
    private String cargo;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public Administrativo() {
    }

    public Administrativo(Integer idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public Integer getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(Integer idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdministrativo != null ? idAdministrativo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrativo)) {
            return false;
        }
        Administrativo other = (Administrativo) object;
        if ((this.idAdministrativo == null && other.idAdministrativo != null) || (this.idAdministrativo != null && !this.idAdministrativo.equals(other.idAdministrativo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Administrativo[ idAdministrativo=" + idAdministrativo + " ]";
    }
    
}
