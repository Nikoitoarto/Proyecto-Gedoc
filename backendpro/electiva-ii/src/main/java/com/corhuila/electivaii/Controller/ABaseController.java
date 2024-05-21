package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Dto.ApiResponseDTO;
import com.corhuila.electivaii.Entity.ABaseEntity;
import com.corhuila.electivaii.IService.IBaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:9000/electiva-ii/swagger-ui/index.html#/
public abstract class ABaseController<T extends ABaseEntity, S extends IBaseService<T>> {
    protected S service;
    protected String entityName;
    protected ABaseController(S service, String entityName) {
        this.service = service;
        this.entityName = entityName;
    }

    @GetMapping
    public ResponseEntity<ApiResponseDTO<List<T>>> findByStateTrue() {
        try {
            return ResponseEntity.ok(new ApiResponseDTO<List<T>>("Datos obtenidos", service.findByStateTrue(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDTO<List<T>>(e.getMessage(), null, false));
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<ApiResponseDTO<T>> show(@PathVariable Long id) {
        try {
            T entity = service.findById(id);
            return ResponseEntity.ok(new ApiResponseDTO<T>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDTO<T>(e.getMessage(), null, false));
        }
    }

    @PostMapping
    public ResponseEntity<ApiResponseDTO<T>> save(@RequestBody T entity) {
        try {
            return ResponseEntity.ok(new ApiResponseDTO<T>("Datos guardados", service.save(entity), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDTO<T>(e.getMessage(), null, false));
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<ApiResponseDTO<T>> update(@PathVariable Long id, @RequestBody T entity) {
        try {
            service.update(id, entity);
            return ResponseEntity.ok(new ApiResponseDTO<T>("Datos actualizados", null, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDTO<T>(e.getMessage(), null, false));
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ApiResponseDTO<T>> delete(@PathVariable Long id) {
        try {
            service.delete(id);
            return ResponseEntity.ok(new ApiResponseDTO<T>("Registro eliminado", null, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDTO<T>(e.getMessage(), null, false));
        }
    }
}