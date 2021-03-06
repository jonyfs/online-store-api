/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonyfs.online.store.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
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
public class Product extends AbstractAuditable<User, Long> {

    private static final long serialVersionUID = -1530816839411604526L;

    @Column
    @NotEmpty
    @Size(max = 200)
    private String name;

    @ManyToOne(targetEntity = Category.class)
    @NotNull
    private Category category;

    @OneToMany(targetEntity = Stock.class, mappedBy = "product")
    private List<Stock> stocks;

}
