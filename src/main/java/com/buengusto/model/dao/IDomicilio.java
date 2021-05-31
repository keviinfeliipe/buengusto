package com.buengusto.model.dao;

import com.buengusto.model.dto.DetalleDomicilioDTO;
import com.buengusto.model.dto.DomicilioDTO;

import java.util.List;

public interface IDomicilio {
    void crear() throws Exception;

    void crearDetalle(int id) throws Exception;

    List<DomicilioDTO> listar(String estado) throws Exception;

    DetalleDomicilioDTO buscar(int id) throws Exception;

    void actualizar(int id, int estado) throws Exception;
}
