/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonyfs.online.store.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.domain.AbstractAuditable;

/**
 *
 * @author jony
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Category extends AbstractAuditable<User, Long> {

    private static final long serialVersionUID = -5330930853338072254L;

    @NotEmpty
    @Size(max = 200)
    String name;

    @OneToMany(targetEntity = Product.class, mappedBy = "category")
    private List<Product> products;


}
