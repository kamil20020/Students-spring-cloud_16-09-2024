package pl.learning.spring_cloud.classroom.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CLASSES")
public class ClassroomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID courseId;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "classes_students_ids", joinColumns = @JoinColumn(name = "class_id"))
    private Set<UUID> studentsIds;
}
