package com.groupeisi.mapper;
import com.groupeisi.dto.EtudiantDto;
import com.groupeisi.entities.Etudiant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EtudiantMapper {
    EtudiantDto toDto(Etudiant etudiant);
    Etudiant toEntity(EtudiantDto dto);
    @Mapping(target = "id", ignore = true)
    void updateEtudiantFromDto(EtudiantDto dto, @MappingTarget Etudiant entity);
}
