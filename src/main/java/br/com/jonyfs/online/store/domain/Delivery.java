/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonyfs.online.store.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.AbstractAuditable;

/**
 *
 * @author jony
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Delivery extends AbstractAuditable<User, Long> {

    private static final long serialVersionUID = -5330930853338072254L;

    @OneToMany(targetEntity = OrderItem.class, mappedBy = "delivery")
    private List<OrderItem> items;

    @ManyToOne(targetEntity = Authorization.class)
    private Authorization authorization;
}
