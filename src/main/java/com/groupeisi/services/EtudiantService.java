package com.groupeisi.services;
import com.groupeisi.dto.EtudiantDto;
import java.util.List;
public interface EtudiantService {
    EtudiantDto createEtudiant(EtudiantDto etudiantDto);

    EtudiantDto getEtudiantById(Long id);

    List<EtudiantDto> getAllEtudiants();

    EtudiantDto updateEtudiant(Long id, EtudiantDto articleDto);

    void deleteEtudiant(Long id);
}
