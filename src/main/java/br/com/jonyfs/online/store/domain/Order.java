/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonyfs.online.store.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
public class Order extends AbstractAuditable<User, Long> {

    private static final long serialVersionUID = -1530816839411604526L;

    @ManyToOne(targetEntity = User.class)
    @NotNull
    private User user;

    @Column
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date registrationDate;

    @OneToMany(targetEntity = OrderItem.class, mappedBy = "order")
    private List<OrderItem> items;

    @OneToOne(targetEntity = Authorization.class)
    private Authorization authorization;
}
