/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonyfs.online.store.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
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
public class Invoice extends AbstractAuditable<User, Long> {

    private static final long serialVersionUID = -5330930853338072254L;

    @NotNull
    @NotEmpty
    @OneToMany(targetEntity = InvoiceItem.class, mappedBy = "invoice")
    private List<InvoiceItem> items;

    @OneToOne(targetEntity = Authorization.class)
    private Authorization authorization;


}
