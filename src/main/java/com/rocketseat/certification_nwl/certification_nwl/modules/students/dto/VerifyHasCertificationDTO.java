package com.rocketseat.certification_nwl.certification_nwl.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerifyHasCertificationDTO {

    private String email;
    private String tecnology;
}
