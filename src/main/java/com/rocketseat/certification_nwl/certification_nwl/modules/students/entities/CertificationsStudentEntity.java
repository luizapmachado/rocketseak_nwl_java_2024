package com.rocketseat.certification_nwl.certification_nwl.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CertificationsStudentEntity {

    private UUID id;
    private UUID studentId;
    private String technology;
    private int grade;
    private List<AnswersCertificationEntity> answersCertificationEntities;
}
