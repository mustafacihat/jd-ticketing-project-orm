package com.cybertek.service;

import com.cybertek.dto.ProjectDTO;

import java.util.List;

public interface ProjectService {

    ProjectDTO getByProjectCode(String code);
    List<ProjectDTO> listAllProject();
    void save(ProjectDTO dto);
    ProjectDTO update(ProjectDTO dto);
    void delete(String code);
    void complete(String projectCode);
}
