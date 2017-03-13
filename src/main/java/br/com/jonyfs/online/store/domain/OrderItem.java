/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonyfs.online.store.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
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
public class OrderItem extends AbstractAuditable<User, Long> {

    private static final long serialVersionUID = -1530816839411604526L;

    @Column
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date registrationDate;

    @Column
    @NotNull
    @DecimalMin("0.00")
    Double quantity;

    @ManyToOne(targetEntity = Product.class)
    @NotNull
    private Product product;

    @ManyToOne(targetEntity = Order.class)
    @NotNull
    private Order order;

    @ManyToOne(targetEntity = Delivery.class)
    private Delivery delivery;

}
