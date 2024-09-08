package com.example.second_project.mapper;

import com.example.second_project.dto.request.RoleRequest;
import com.example.second_project.dto.response.RoleResponse;
import com.example.second_project.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
