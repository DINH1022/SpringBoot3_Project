package com.example.second_project.mapper;

import com.example.second_project.dto.request.UserCreationRequest;
import com.example.second_project.dto.request.UserUpdateRequest;
import com.example.second_project.dto.response.UserResponse;
import com.example.second_project.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
