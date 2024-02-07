package com.rocketseat.certification_nwl.certification_nwl.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentEntity {

    private UUID id;
    private String email;
    private List<CertificationsStudentEntity> certificationsStudentEntities;
}
