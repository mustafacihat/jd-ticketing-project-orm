package com.cybertek.mapper;

import com.cybertek.dto.RoleDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;

@Component
public class RoleMapper {

    private ModelMapper modelMapper;

    public RoleMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Role convertToEntity(RoleDTO dto){
        return modelMapper.map(dto,Role.class);
    }

    public RoleDTO convertToDto(com.cybertek.entity.Role entity){
        return modelMapper.map(entity,RoleDTO.class);
    }
}
