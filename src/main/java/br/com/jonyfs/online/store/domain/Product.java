/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonyfs.online.store.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author jony
 */
@Data
@Entity
public class Product extends AuditableEntity<Long> {

    private static final long serialVersionUID = -5330930853338072254L;

    @NotEmpty
    @Size(max = 200)
    String name;

    @ManyToOne(targetEntity = Category.class)
    @NotNull
    private Category category;

}
