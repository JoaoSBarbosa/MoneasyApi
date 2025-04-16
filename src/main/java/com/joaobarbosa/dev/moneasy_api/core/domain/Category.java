package com.joaobarbosa.dev.moneasy_api.core.domain;

import com.joaobarbosa.dev.moneasy_api.core.enums.TypeEnum;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Table(name = "tb_categoria")
public class Category {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TypeEnum type;

}
