package com.coursemanagement.controller;

import com.coursemanagement.dto.CourseRequest;
import com.coursemanagement.dto.TeacherRequest;
import com.coursemanagement.dto.TeacherResponse;
import com.coursemanagement.entity.Course;
import com.coursemanagement.service.TeacherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
@RequiredArgsConstructor
public class TeacherController {
    
    private final TeacherService teacherService;
    
    @GetMapping
    public ResponseEntity<List<TeacherResponse>> getTeachers() {
        return ResponseEntity.ok(teacherService.getTeachers());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TeacherResponse> getTeacherById(@PathVariable Long id) {
        return ResponseEntity.ok(teacherService.getTeacherById(id));
    }
    
    @PostMapping
    public ResponseEntity<TeacherResponse> createTeacher(@Valid @RequestBody TeacherRequest request) {
        return new ResponseEntity<>(teacherService.createTeacher(request), HttpStatus.CREATED);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<TeacherResponse> updateTeacher(
            @PathVariable Long id, 
            @Valid @RequestBody TeacherRequest request) {
        return ResponseEntity.ok(teacherService.updateTeacher(id, request));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/{teacherId}/courses")
    public ResponseEntity<List<Course>> getAllCoursesForTeacher(@PathVariable Long teacherId) {
        return ResponseEntity.ok(teacherService.getAllCoursesForTeacher(teacherId));
    }
    
    @PostMapping("/{teacherId}/courses")
    public ResponseEntity<Course> createCourseForTeacher(
            @PathVariable Long teacherId, 
            @Valid @RequestBody CourseRequest request) {
        return new ResponseEntity<>(
            teacherService.createCourseForTeacher(teacherId, request), 
            HttpStatus.CREATED
        );
    }
    
    @PutMapping("/{teacherId}/courses/{courseId}")
    public ResponseEntity<Course> updateCourseForTeacher(@PathVariable Long teacherId, @PathVariable Long courseId, @Valid @RequestBody CourseRequest request) {
        return ResponseEntity.ok(teacherService.updateCourseForTeacher(teacherId, courseId, request));
    }
    
    @DeleteMapping("/{teacherId}/courses/{courseId}")
    public ResponseEntity<Void> deleteCourseForTeacher(@PathVariable Long teacherId, @PathVariable Long courseId) {
        teacherService.deleteCourseForTeacher(teacherId, courseId);
        return ResponseEntity.ok().build();
    }
}