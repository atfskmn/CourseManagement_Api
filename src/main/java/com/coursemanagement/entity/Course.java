package com.coursemanagement.entity;

import lombok.*;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses", schema = "academicdb")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course extends BaseEntity {
    
    @Column(nullable = false)
    private String name;
    
    @Column(length = 1000)
    private String description;
    
    @Column(nullable = false)
    private Double price;
    
    @Column(name = "max_students", nullable = false)
    private Integer maxStudents;
    
    @Column(name = "current_student_count")
    @Builder.Default
    private Integer currentStudentCount = 0;
    
    @Column(name = "is_available")
    @Builder.Default
    private Boolean isAvailable = true;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;
    
    @ManyToMany(mappedBy = "enrolledCourses", fetch = FetchType.LAZY)
    @Builder.Default
    private List<Student> students = new ArrayList<>();
    
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<CartItem> cartItems = new ArrayList<>();
    
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    private List<OrderItem> orderItems = new ArrayList<>();
    
    public boolean canEnroll() {
        return isAvailable && currentStudentCount < maxStudents;
    }
    
    public boolean enrollStudent() {
        if (canEnroll()) {
            currentStudentCount++;
            if (currentStudentCount >= maxStudents) {
                isAvailable = false;
            }
            return true;
        }
        return false;
    }
    
    public void unenrollStudent() {
        if (currentStudentCount > 0) {
            currentStudentCount--;
            if (!isAvailable && currentStudentCount < maxStudents) {
                isAvailable = true;
            }
        }
    }
}