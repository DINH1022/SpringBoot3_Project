package com.example.second_project.mapper;

import com.example.second_project.dto.request.PermissionRequest;
import com.example.second_project.dto.response.PermissionResponse;
import com.example.second_project.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}