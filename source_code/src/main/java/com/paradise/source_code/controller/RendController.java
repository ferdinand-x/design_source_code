package com.paradise.source_code.controller;

import com.paradise.source_code.pojo.bo.HitRateBO;
import com.paradise.source_code.pojo.bo.RenderBO;
import com.paradise.source_code.service.RenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/demo")
@RequiredArgsConstructor
public class RendController {

    private final RenderService renderService;

    @PostMapping("/render")
    public String render(@RequestBody RenderBO renderBO){
        return this.renderService.render(renderBO);
    }

    @GetMapping("/hit_rate")
    public HitRateBO hitRate(){
        return this.renderService.hitRate();
    }
}
