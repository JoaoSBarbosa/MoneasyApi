package com.joaobarbosa.dev.moneasy_api.core.domain;

import com.joaobarbosa.dev.moneasy_api.core.abstractions.Auditable;
import com.joaobarbosa.dev.moneasy_api.core.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Table(name = "tb_transacao")
public class Transaction extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "descricao")
    private String description;

    @Column(name = "valor")
    private BigDecimal value;
    @Column(name = "data_hora")
    private LocalDateTime date;
    @Column(name = "tipo")
    private TransactionType type;

    @JoinColumn(name = "usuario_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
