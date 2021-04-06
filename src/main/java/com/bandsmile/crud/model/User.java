package com.bandsmile.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name = "User")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Size(min = 3,message = "Verifez votre Prenom")
    @Column(name = "Firstname",nullable = false)
    private String firstname;

    @Size(min = 3,message = "Verifez votre nom")
    @Column(name = "Lastname",nullable = false)
    private String lastname;

    @Email(message = "Verifiez Votre email")
    @Column(name = "Email",nullable = false)
    private String email;

    @NotEmpty(message = "Entrez votre adresse")
    @Column(name = "Adresse")
    private String adresse;
    @Column(name = "Adresse2")
    private String adresse2;

    @NotEmpty(message = "Nom d'utilisateur déjà existant ou champs vide, Merci de ressayer")
    @Column(name = "UserName", unique = true)
    private String userName;

    @NotEmpty(message = "Entrez un mot de passe")
    @Size(min = 8,message = "Minimum 8 caracteres")
    @Column(name = "Password")
    private String password;

    @NotEmpty(message = "Entrez votre numero")
    @Size(min = 8,max = 13)
    @Column(name = "Tel")
    private String tel;

    @NotEmpty(message = "Selectionnez un pays")
    @Column(name = "Country")
    private String country;

    @Size(min = 4)
    @Column(name = "City")
    private String city;

    @Size(min = 4)
    @Column(name = "CodePost")
    private Integer codepost;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCodepost() {
        return codepost;
    }

    public void setCodepost(Integer codepost) {
        this.codepost = codepost;
    }
}
