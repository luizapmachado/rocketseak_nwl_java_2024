package com.rocketseat.certification_nwl.certification_nwl.modules.students.services;

import com.rocketseat.certification_nwl.certification_nwl.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("luiza@gmail.com") && dto.getTecnology().equals("JAVA")) {
            return true;
        }

        return false;
    }
}
