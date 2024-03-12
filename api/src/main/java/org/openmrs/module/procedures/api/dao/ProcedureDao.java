package org.openmrs.module.procedures.api.dao;

import javax.validation.constraints.NotNull;

import java.util.Optional;

import org.openmrs.module.procedures.api.model.Procedure;
import org.springframework.transaction.annotation.Transactional;

public interface ProcedureDao {
	
	Optional<Procedure> get(@NotNull int id);
	
	Optional<Procedure> getProcedureByUuid(@NotNull String uuid);
}
