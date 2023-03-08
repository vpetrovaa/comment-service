package com.solvd.commentservice.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "note", url = "http://${open.feign.host}/api/v1/notes")
public interface NoteClient {

    @GetMapping("/exists/{id}")
    boolean isExistById(@PathVariable Long id);

}
