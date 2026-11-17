package com.codingshuttle.learnKafka.user_service.config;

import com.codingshuttle.learnKafka.user_service.dto.CreateUserRequestDto;
import com.codingshuttle.learnKafka.user_service.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper() {

        ModelMapper mapper = new ModelMapper();
        //
        mapper.typeMap(CreateUserRequestDto.class, User.class).addMappings(m -> {
            m.map(CreateUserRequestDto::getName, User::setFullName);
        });
        return mapper;
    }
}
