package com.cybertek.implementation;

import com.cybertek.dto.ProjectDTO;
import com.cybertek.entity.Project;
import com.cybertek.entity.User;
import com.cybertek.enums.Status;
import com.cybertek.mapper.ProjectMapper;
import com.cybertek.mapper.UserMapper;
import com.cybertek.repository.ProjectRepository;
import com.cybertek.repository.UserRepository;
import com.cybertek.service.ProjectService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectMapper projectMapper;
    private ProjectRepository projectRepository;
    private UserMapper userMapper;
    private UserRepository userRepository;

    public ProjectServiceImpl(ProjectMapper projectMapper, ProjectRepository projectRepository, UserMapper userMapper, UserRepository userRepository) {
        this.projectMapper = projectMapper;
        this.projectRepository = projectRepository;
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public ProjectDTO getByProjectCode(String code) {
        return null;
    }

    @Override
    public List<ProjectDTO> listAllProject() {

        List<Project> list = projectRepository.findAll(Sort.by("projectCode"));
        return list.stream().map(obj -> projectMapper.convertToDto(obj)).collect(Collectors.toList());

    }

    @Override
    public void save(ProjectDTO dto) {
        dto.setProjectStatus(Status.OPEN);
        Project object = projectMapper.convertToEntity(dto);
        object.setAssignedManager(userMapper.convertToEntity(dto.getAssignedManager()));
        projectRepository.save(object);
    }

    @Override
    public ProjectDTO update(ProjectDTO dto) {
        return null;
    }

    @Override
    public void delete(String code) {
        Project project = projectRepository.findByProjectCode(code);
        project.setIsDeleted(true);
        projectRepository.save(project);
    }

    @Override
    public void complete(String projectCode) {
        Project project = projectRepository.findByProjectCode(projectCode);
        project.setProjectStatus(Status.COMPLETE);
        projectRepository.save(project);
    }
}
