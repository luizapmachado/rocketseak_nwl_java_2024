package com.rocketseat.certification_nwl.certification_nwl.modules.students.controllers;

import com.rocketseat.certification_nwl.certification_nwl.modules.students.dto.VerifyHasCertificationDTO;
import com.rocketseat.certification_nwl.certification_nwl.modules.students.services.VerifyHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    VerifyHasCertificationUseCase verifyHasCertificationUseCase;

    @PostMapping("/verifyHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verify) {
        boolean result = this.verifyHasCertificationUseCase.execute(verify);

        if (result) {
            return "Usuario já fez a prova";
        }

        return "Usuario pode fazer a prova";

    }
}
