package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;

/**
 * Product entity.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;
    @NotBlank(message= "product ID cannot be blank")
    private String productId;
    @NotBlank(message= "product name cannot be blank")
    private String name;
    @NotBlank(message= "product price cannot be blank")
    private BigDecimal price;
    }

}
