package com.coursemanagement.entity;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "cart_items", schema = "academicdb", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"cart_id", "course_id"})
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItem extends BaseEntity {
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
}