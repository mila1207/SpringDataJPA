package com.mila.SpringData.repositoy;

import com.mila.SpringData.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>
{
}
