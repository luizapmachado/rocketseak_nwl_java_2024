package com.rocketseat.certification_nwl.certification_nwl.modules.students.services;

import com.rocketseat.certification_nwl.certification_nwl.modules.students.dto.VerifyHasCertificationDTO;
import com.rocketseat.certification_nwl.certification_nwl.modules.students.repositories.CertificationStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyHasCertificationUseCase {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public boolean execute(VerifyHasCertificationDTO dto) {
        var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(),
                dto.getTechnology());
        return !result.isEmpty();
    }
}
