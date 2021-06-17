package com.mila.SpringData.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "student", uniqueConstraints =
        {@UniqueConstraint(name = "student_email_unique"
                , columnNames = "email")
        }
)
@Data
@NoArgsConstructor
@ToString
@RequiredArgsConstructor
public class Student {


    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name = "id", updatable = false)
    private Long id;

    @NonNull
    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;

    @NonNull
    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @NonNull
    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    private String email;

    @NonNull
    @Column(name = "age", nullable = false)
    private Integer age;
}
